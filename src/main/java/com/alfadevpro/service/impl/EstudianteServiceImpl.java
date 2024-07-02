package com.alfadevpro.service.impl;

import org.springframework.stereotype.Service;

import com.alfadevpro.entities.EstudianteEntity;
import com.alfadevpro.repositories.BaseRepository;
import com.alfadevpro.service.EstudianteService;

@Service
public class EstudianteServiceImpl extends BaseServiceImpl<EstudianteEntity,Long> implements EstudianteService{

	public EstudianteServiceImpl(BaseRepository<EstudianteEntity, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
