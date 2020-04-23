package com.sample.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.prop.LegalEntityContact;
import com.sample.prop.Rating;


/**
 * This class is defnied as component and not inside the 
 * Configuration class, because we wanted to Autowire its
 * Constructor.
 * @author AANU
 *
 */
@Component
public class LegalEntity {
	
	LegalEntityContact leContact;
	int code;
	String name;
	Rating rating;
	
	@Autowired
	public LegalEntity(LegalEntityContact contact) {
		this.leContact = contact;
	}
	
	@Override
	public String toString() {
		return this.name + "/" + this.code + "/" + this.leContact.toString() + "/" + this.rating.toString();
	}
	
	public void setCode(int i) {
		this.code = i;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	@Autowired
	public void setRating(Rating r) {
		this.rating = r;
	}
}
