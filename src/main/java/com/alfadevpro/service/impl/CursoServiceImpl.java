package com.alfadevpro.service.impl;

import org.springframework.stereotype.Service;
import com.alfadevpro.entities.CursoEntity;
import com.alfadevpro.repositories.BaseRepository;
import com.alfadevpro.service.CursoService;

@Service
public class CursoServiceImpl extends BaseServiceImpl<CursoEntity,Long> implements CursoService{

	public CursoServiceImpl(BaseRepository<CursoEntity, Long> baseRepository) {
		super(baseRepository);
		// CRUD de curso hecho por Servicio Generico anteriormente creado
	}

}
