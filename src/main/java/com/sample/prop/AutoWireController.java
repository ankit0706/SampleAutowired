package com.sample.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.component.LegalEntity;

@RestController
public class AutoWireController {
	
	@Autowired
	LegalEntity le;
	
	@RequestMapping("/readle")
	public String getNatBank() {
		le.setCode(1509);
		le.setName("Skydeck");
		return le.toString();
	}
	
	
	
}
