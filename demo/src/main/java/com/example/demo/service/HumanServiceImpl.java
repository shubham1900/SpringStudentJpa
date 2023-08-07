package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HumanDao;
import com.example.demo.dto.HumanDtoSe;
import com.example.demo.model.Human;

@Service
public class HumanServiceImpl implements HumanService {

	@Autowired
	HumanDao humandao;

	@Override
	public String addHuman(Human hum) {
		Human humsaved = humandao.save(hum);

//Converting from model class to DTO
//		HumanDtoSe huma = new HumanDtoSe(humsaved.getId(), humsaved.getName(), humsaved.getAge());
		// return "Human hogya na madarchod";
		return "Successful";
	}
//
//	@Override
//	public HumanDtoSe findbyId(Integer id) {
//		Optional<Human> humsaved = humandao.findById(id);
//		Human huma = humsaved.get();
//		HumanDtoSe humasaved = new HumanDtoSe(huma.getId(), huma.getName(), huma.getAge());
//		return humasaved;
//	}
//
//	@Override
//	public List<HumanDtoSe> findallhuman() {
//		List<Human> findAll = humandao.findAll();
//		List<HumanDtoSe> findAllHuman = new ArrayList<>();
//		for (Human human : findAll) {
//			HumanDtoSe humTemp = new HumanDtoSe(human.getId(), human.getName(), human.getAge());
//			findAllHuman.add(humTemp);
//		}
//		return findAllHuman;
//	}
//
//	@Override
//	public String deleteHuman(Integer id) {
//		try {
//			humandao.delete(humandao.findById(id).get());
//		} catch (Exception e) {
//			return "unsuccessful";
//		}
//
//		return "successful";
//	}

	@Override
	public HumanDtoSe findbyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HumanDtoSe> findallhuman() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteHuman(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
