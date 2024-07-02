package com.alfadevpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alfadevpro.entities.PermissionEntity;
import com.alfadevpro.entities.RoleEntity;
import com.alfadevpro.repositories.IRoleRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleService {

	  @Autowired
	    private IRoleRepository roleRepository;

	    @Autowired
	    private PermissionService permissionService;

	    @Transactional
	    public RoleEntity saveRole(RoleEntity roleEntity, Set<Long> permissionIds) {
	        // Manejar las entidades de permiso obtenidas de PermissionService
	        Set<PermissionEntity> managedPermissions = new HashSet<>();
	        for (Long permissionId : permissionIds) {
	            PermissionEntity permissionEntity = permissionService.getPermissionById(permissionId);
	            managedPermissions.add(permissionEntity);
	        }

	        // Asignar la lista de permisos al roleEntity
	        roleEntity.setPermissionList(managedPermissions);

	        // Guardar el roleEntity
	        RoleEntity savedRoleEntity = roleRepository.save(roleEntity);

	        // Retornar el roleEntity guardado
	        return savedRoleEntity;
	    }
}
