package com.alfadevpro.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfadevpro.entities.EstudianteEntity;
import com.alfadevpro.service.impl.EstudianteServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/estudiantes")
@PreAuthorize("isAuthenticated()")
public class EstudianteController extends BaseControllerImpl <EstudianteEntity, EstudianteServiceImpl>{

}
