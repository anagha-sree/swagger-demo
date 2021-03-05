package in.stackroute.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.stackroute.demo.model.Flight;
import in.stackroute.demo.repository.FlightRepository;

@Service("FlightService")
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public boolean save(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> list() {
		// TODO Auto-generated method stub
		return null;
	}


}
