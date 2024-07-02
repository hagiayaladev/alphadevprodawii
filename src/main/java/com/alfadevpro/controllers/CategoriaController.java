package com.alfadevpro.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfadevpro.entities.CategoriaEntity;
import com.alfadevpro.service.impl.CategoriaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/categorias")
@PreAuthorize("isAuthenticated()")
public class CategoriaController extends BaseControllerImpl<CategoriaEntity, CategoriaServiceImpl>{

}
