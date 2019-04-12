package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.dto.JobsDTO;
import com.mycompany.ghhrkapp1.entity.Jobs;

public interface JobService {
	
	Iterable<Jobs> listAll();
	Page<Jobs> listAllPaged(int page);
	Jobs save(JobsDTO jobsDTO);

}
