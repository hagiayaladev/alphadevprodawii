package com.alfadevpro.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alfadevpro.entities.PermissionEntity;


@Repository
public interface IPermissionRepository extends JpaRepository<PermissionEntity, Long>{

}
