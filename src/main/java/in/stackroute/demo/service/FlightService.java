package in.stackroute.demo.service;

import java.util.List;

import in.stackroute.demo.model.Flight;

public interface FlightService {

	public boolean save(Flight flight);
	
	public boolean update(Flight flight);
	
	public boolean delete(Flight flight);
	
	public List<Flight> list();
	
	
}
