package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HumanDtoSe;
import com.example.demo.model.Human;

public interface HumanService {

	String addHuman(Human hum);

	HumanDtoSe findbyId(Integer id);
	List<HumanDtoSe> findallhuman();
	
	String deleteHuman (Integer id);
	

}
