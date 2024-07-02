package com.alfadevpro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alfadevpro.entities.UserEntity;
import com.alfadevpro.repositories.IUserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findUserEntitiesByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
		
		List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
		
		userEntity.getRoles()
			.forEach(role -> authorityList.add(new SimpleGrantedAuthority("ROLE_".concat(role.getRoleEnum().name()))));
		
		userEntity.getRoles().stream()
			.flatMap(role -> role.getPermissionList().stream())
			.forEach(permission -> authorityList.add(new SimpleGrantedAuthority(permission.getName())));
		
		return new User(userEntity.getUsername(),
				userEntity.getPassword(),
				userEntity.getIsEnabled(),
				userEntity.getIsAccountNonExpired(),
				userEntity.getIsAccountNonLocked(),
				userEntity.getIsCredentialsNonExpired(),
				authorityList
				);
	}

}
