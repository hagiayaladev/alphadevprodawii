package com.alfadevpro.service.impl;

import org.springframework.stereotype.Service;

import com.alfadevpro.entities.InstructorEntity;
import com.alfadevpro.repositories.BaseRepository;
import com.alfadevpro.service.InstructorService;

@Service
public class InstructorServiceImpl extends BaseServiceImpl<InstructorEntity,Long> implements InstructorService{

	public InstructorServiceImpl(BaseRepository<InstructorEntity, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
