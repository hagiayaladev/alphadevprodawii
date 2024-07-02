package com.alfadevpro.service.impl;

import org.springframework.stereotype.Service;

import com.alfadevpro.entities.CategoriaEntity;
import com.alfadevpro.repositories.BaseRepository;
import com.alfadevpro.service.CategoriaService;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<CategoriaEntity,Long> implements CategoriaService{

	public CategoriaServiceImpl(BaseRepository<CategoriaEntity, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
