package com.alfadevpro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alfadevpro.entities.RoleEntity;


@Repository
public interface IRoleRepository extends JpaRepository<RoleEntity, Long>{

}
