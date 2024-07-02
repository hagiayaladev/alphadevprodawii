package com.alfadevpro.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfadevpro.entities.CursoEntity;
import com.alfadevpro.service.impl.CursoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/cursos")
@PreAuthorize("isAuthenticated()")
public class CursoController extends BaseControllerImpl<CursoEntity, CursoServiceImpl> {
	
	

}
