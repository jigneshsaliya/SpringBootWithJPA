package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VehicleTypeRepository;
import com.example.demo.modal.VehicleType;

@Service
public class VehicleTypeServiceImpl implements VehicleTypeService{
	
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	@Override
	public VehicleType findByVehicleType(String vehicleType) {
		VehicleType vehicleType2 = vehicleTypeRepository.findByVehicleType(vehicleType);
		return vehicleType2;
	}
	
	public Integer saveVehicleType(VehicleType vehicleType) {
		VehicleType vehicleType2 = vehicleTypeRepository.save(vehicleType);
		return vehicleType2.getVehicleId();
	}

	public List<VehicleType> getAllVehicleList() {
		return vehicleTypeRepository.findAll();
	}
	
	public VehicleType getVehicleByName(String vehicleName) {
		return vehicleTypeRepository.findByVehicleType(vehicleName);
	}
}
