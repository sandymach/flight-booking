package com.cts.pss.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.pss.dao.FlightDao;


public class FlightServiceImpl {
	@Autowired
	private FlightDao flightDao;
	
	public boolean isAvalable(int numberofPassengers) {
		
		return true;
	}

}
