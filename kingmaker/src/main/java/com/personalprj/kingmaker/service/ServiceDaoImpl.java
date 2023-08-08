package com.personalprj.kingmaker.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalprj.kingmaker.dto.InputDTO;
import com.personalprj.kingmaker.entity.Input;
import com.personalprj.kingmaker.repo.InputRepo;



@Service(value="ServiceDAO")
@Transactional
public class ServiceDaoImpl implements ServiceDAO{
	
	@Autowired
	InputRepo inputRepo;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public Boolean storeString(InputDTO inputDTO) {
		
		Input text = modelMapper.map(inputDTO, Input.class);

		if (inputRepo.save(text) != null)
			
			return true;
		
		else 
		
			return false;
		 
	}

}
