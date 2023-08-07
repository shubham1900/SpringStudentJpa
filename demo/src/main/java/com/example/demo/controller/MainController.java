package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HumanDtoDeS;
import com.example.demo.dto.HumanDtoSe;
import com.example.demo.model.Human;
import com.example.demo.service.HumanService;

@RestController // this will return in form of JSON
@RequestMapping("/main") // This will provide address to our controller
public class MainController {
	
	@Autowired
	HumanService humanservice;

	@GetMapping("/hello") // this will get something
	public String sayHello() {
		return "Bhag Bhosadike";

	}
	@PostMapping("/add")
	public String addHuman(@RequestBody HumanDtoDeS humanDtoDeS){     //Requestbody performs Deserialization
//		Human hum=new Human( humanDtoDeS.getName(), humanDtoDeS.getAge());
//		HumanDtoSe huma=  humanservice.addHuman(hum);
//		return huma;	
		Human hum=new Human(humanDtoDeS.getName(), humanDtoDeS.getAge(), humanDtoDeS.getHumanReport());
		humanservice.addHuman(hum);
		return "succesfull";
	}
//	@GetMapping("/by/{id}")
//	public HumanDtoSe findbyId(@PathVariable("id")Integer id)
//	{
//		
//		HumanDtoSe hum=humanservice.findbyId(id);
//		return hum ;
//		
//	}
//	@GetMapping("/all")
//	public List<HumanDtoSe> findAll()
//	{
//		List<HumanDtoSe> findallhuman = humanservice.findallhuman();
//		return findallhuman;
//		
//	}
//	@DeleteMapping("/delete/{id}")
//	public String deletehuman(@PathVariable("id")Integer id) {
//		
//		String deleteHuman = humanservice.deleteHuman(id);
//		
//		return deleteHuman;
//		
//	}
}
