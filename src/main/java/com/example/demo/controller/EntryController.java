package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.VehicleTypeRepository;
import com.example.demo.modal.VehicleType;
import com.example.demo.service.VehicleTypeServiceImpl;

@Controller
public class EntryController {
	@Autowired
	VehicleTypeServiceImpl vehicleTypeServiceImpl;
	
	@Autowired
	VehicleTypeRepository vehicleTypeRepository;
	
	@RequestMapping(value="/get", method = RequestMethod.GET)
	public ResponseEntity<?> getVehicleList() {
		VehicleType vehicleType = new VehicleType();
		vehicleType.setCreatedDate("20171121");
		vehicleType.setVehicleType("Sedan");
		vehicleTypeRepository.save(vehicleType);
		List<VehicleType> list = vehicleTypeServiceImpl.getAllVehicleList(); 
		System.out.println(list.size());
		return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
	}
}
