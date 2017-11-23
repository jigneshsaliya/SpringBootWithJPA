package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.VehicleTypeRepository;
import com.example.demo.modal.VehicleType;
import com.example.demo.service.VehicleTypeServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CarWalletApplicationTests {
	@Autowired
	VehicleTypeServiceImpl vehicleTypeServiceImpl;
	
	@Autowired
	VehicleTypeRepository vehicleTypeRepository;
	
	@Test
	public void shouldAddVehicleType() {
		// test 
		VehicleType vehicleType = new VehicleType();
		vehicleType.setVehicleType("Coupe");
		vehicleType.setCreatedDate("20171122");
		VehicleType id = vehicleTypeRepository.save(vehicleType);
		assertNotNull(id);
	}
	
	@Test
	public void shouldReurnListOfVehicle() {
		List<VehicleType> list = vehicleTypeServiceImpl.getAllVehicleList();
		assertNotEquals(0, list.size());
	}
	
	@Test
	public void shouldRetrunVehicle() {
		VehicleType vehicleType = vehicleTypeServiceImpl.findByVehicleType("Coupe");
		assertEquals("Coupe", vehicleType.getVehicleType());
	}
	
	@Test
	public void shouldDeleteVehicleType() {
		VehicleType vehicleType = vehicleTypeServiceImpl.findByVehicleType("Coupe");
		vehicleTypeRepository.delete(vehicleType);
		vehicleType = vehicleTypeServiceImpl.findByVehicleType("Coupe");
		assertEquals(null, vehicleType);
	}

}
