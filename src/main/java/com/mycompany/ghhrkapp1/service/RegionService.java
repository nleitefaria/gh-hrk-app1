package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.dto.RegionsDTO;
import com.mycompany.ghhrkapp1.entity.Regions;

public interface RegionService 
{
	Iterable<Regions> listAll();
	Page<Regions> listAllPaged(int page);
	Regions save(RegionsDTO regionDTO);

}
