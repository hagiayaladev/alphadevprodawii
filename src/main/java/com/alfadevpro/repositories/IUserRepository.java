package com.alfadevpro.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alfadevpro.entities.UserEntity;


@Repository
public interface IUserRepository extends JpaRepository<UserEntity,Long>{

	Optional<UserEntity> findUserEntitiesByUsername(String username);
}
