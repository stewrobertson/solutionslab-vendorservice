package com.deloitte.irs.solutionslab.webapps.prd.solutionslabvendorservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vendor-service")
public class VendorController {

	
	@GetMapping(value = "/api/{id}", produces = "application/json")
	public ResponseEntity<String> getVendor(@PathVariable String id){

		return new ResponseEntity<>("ID Value: " + id, HttpStatus.OK);
	}
	
	@GetMapping(value = "/api", produces = "application/json")
	public ResponseEntity<String> getAllVendors(){
		return new ResponseEntity<>("All Vendors returned", HttpStatus.OK);
	}
	
	@PostMapping(path = "/api", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> createVendor(@RequestBody String id) {
	    return new ResponseEntity<>("Added a new Vendor: " + id, HttpStatus.OK);
	}
	
}
