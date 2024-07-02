package com.alfadevpro.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfadevpro.entities.InstructorEntity;
import com.alfadevpro.service.impl.InstructorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/instructores")
@PreAuthorize("isAuthenticated()")
public class InstructorController extends BaseControllerImpl<InstructorEntity, InstructorServiceImpl>{

}
