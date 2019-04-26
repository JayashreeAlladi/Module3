package com.cg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.TdsMaster;
import com.cg.service.TdsService;
import com.cg.uiException.DetailNotFoundException;



@RestController      //Used to use REST API like POSTMAN to convert into JSON 
public class MyController {
	
	@Autowired   //Used to use REST API like POSTMAN to convert into JSON 
	TdsService tdsService;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@GetMapping("/user/tds/{id}") //method for fetching the data
	public TdsMaster getById(@PathVariable int id) throws DetailNotFoundException{
		TdsMaster tdsMaster=tdsService.getById(id);
		if(tdsMaster==null) {
			throw new DetailNotFoundException("Id not Found wrong ID"+id);
		}
		else
			return tdsMaster;
	}	
	
	
}
