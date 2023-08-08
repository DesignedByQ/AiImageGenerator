package com.personalprj.kingmaker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalprj.kingmaker.entity.Input;

@Repository
public interface InputRepo extends JpaRepository<Input, Long>{

}
