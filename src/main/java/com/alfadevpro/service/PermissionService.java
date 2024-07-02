package com.alfadevpro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alfadevpro.entities.PermissionEntity;
import com.alfadevpro.repositories.IPermissionRepository;



@Service
public class PermissionService {

	@Autowired
    private IPermissionRepository permissionRepository;

    @Transactional(readOnly = true)
    public PermissionEntity getPermissionById(Long id) {
        Optional<PermissionEntity> permissionOptional = permissionRepository.findById(id);
        return permissionOptional.orElseThrow(() -> new RuntimeException("PermissionEntity not found with id: " + id));
    }

    @Transactional
    public PermissionEntity savePermission(PermissionEntity permissionEntity) {
        return permissionRepository.save(permissionEntity);
    }

    
}
