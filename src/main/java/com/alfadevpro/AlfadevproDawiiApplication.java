package com.alfadevpro;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alfadevpro.entities.PermissionEntity;
import com.alfadevpro.entities.RoleEntity;
import com.alfadevpro.entities.RoleEnum;
import com.alfadevpro.entities.UserEntity;
import com.alfadevpro.repositories.IUserRepository;

@SpringBootApplication
public class AlfadevproDawiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlfadevproDawiiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(
			IUserRepository userRepository
			) {
		return args -> {
			
			// Limpiar las tablas
			 userRepository.deleteAll();

            PermissionEntity createPermission = PermissionEntity.builder()
                    .name("CREATE")
                    .build();

            PermissionEntity readPermission = PermissionEntity.builder()
                    .name("READ")
                    .build();

            PermissionEntity updatePermission = PermissionEntity.builder()
                    .name("UPDATE")
                    .build();

            PermissionEntity deletePermission = PermissionEntity.builder()
                    .name("DELETE")
                    .build();


         // Crear roles
            RoleEntity roleAdmin = RoleEntity.builder()
                    .roleEnum(RoleEnum.ADMIN)
                    .permissionList(Set.of(createPermission, readPermission, updatePermission, deletePermission))
                    .build();

            RoleEntity roleStudent = RoleEntity.builder()
                    .roleEnum(RoleEnum.STUDENT)
                    .permissionList(Set.of(readPermission, updatePermission))
                    .build();

            RoleEntity roleGuest = RoleEntity.builder()
                    .roleEnum(RoleEnum.GUEST)
                    .permissionList(Set.of(readPermission))
                    .build();

            RoleEntity roleInstructor = RoleEntity.builder()
                    .roleEnum(RoleEnum.INSTRUCTOR)
                    .permissionList(Set.of(createPermission, readPermission, deletePermission))
                    .build();

            
            UserEntity userAdmin = UserEntity.builder()
                    .username("hagi")
                    .password("1234")
                    .isEnabled(true)
                    .isAccountNonExpired(true)
                    .isAccountNonLocked(true)
                    .isCredentialsNonExpired(true)
                    .roles(Set.of(roleAdmin))
                    .build();

            UserEntity userInstructor = UserEntity.builder()
                    .username("diego")
                    .password("1234")
                    .isEnabled(true)
                    .isAccountNonExpired(true)
                    .isAccountNonLocked(true)
                    .isCredentialsNonExpired(true)
                    .roles(Set.of(roleInstructor))
                    .build();

            UserEntity userGuest = UserEntity.builder()
                    .username("guest")
                    .password("1234")
                    .isEnabled(true)
                    .isAccountNonExpired(true)
                    .isAccountNonLocked(true)
                    .isCredentialsNonExpired(true)
                    .roles(Set.of(roleGuest))
                    .build();

            UserEntity userStudent = UserEntity.builder()
                    .username("student")
                    .password("1234")
                    .isEnabled(true)
                    .isAccountNonExpired(true)
                    .isAccountNonLocked(true)
                    .isCredentialsNonExpired(true)
                    .roles(Set.of(roleStudent))
                    .build();
            
			
			userRepository.saveAll(Set.of(userAdmin, userInstructor, userGuest, userStudent));
			
		};
	}

}
