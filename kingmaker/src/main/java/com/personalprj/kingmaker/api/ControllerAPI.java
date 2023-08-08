package com.personalprj.kingmaker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalprj.kingmaker.dto.InputDTO;
import com.personalprj.kingmaker.entity.Input;
import com.personalprj.kingmaker.service.ServiceDaoImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin
@Validated
public class ControllerAPI {
	
	@Autowired
	ServiceDaoImpl serviceDaoImpl;
	
	@PostMapping(value="/inputstring", consumes = {MediaType.ALL_VALUE})
	public ResponseEntity<Boolean> stringToImage(@RequestBody InputDTO inputDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceDaoImpl.storeString(inputDTO));
	}
	


}
