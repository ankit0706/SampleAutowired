package com.sample.prop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sample.component")
public class LeConfig {
	
	@Bean
	public LegalEntityContact getLeContact() {
		return new LegalEntityContact("randomemail@msn.com", "Bratislava, Slovakia");
	}
	
	@Bean
	public Rating getRating() {
		return new Rating("The Fitch Group", 4.6);
	}

}
