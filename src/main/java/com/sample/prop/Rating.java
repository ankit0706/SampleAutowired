package com.sample.prop;

public class Rating {
	public String ratingAgency;
	public double ratingScore;
	
	public Rating(String s, double r) {
		this.ratingAgency = s;
		this.ratingScore = r;
	}
	
	@Override
	public String toString() {
		return ratingAgency+":"+ratingScore;
	}
}
