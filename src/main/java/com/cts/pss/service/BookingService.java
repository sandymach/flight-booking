package com.cts.pss.service;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Passenger;

public interface BookingService {

	Passenger bookFlight(Passenger passenger, long id, int numberOfPassengers);
	public void updateStatus(String status, long bookingId);
	public BookingRecord getBookingInfo(long bookingId);

}