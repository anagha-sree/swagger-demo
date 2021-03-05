package in.stackroute.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import in.stackroute.demo.model.Flight;
import in.stackroute.demo.service.FlightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Controller
@RequestMapping("/api/v1/flight")
@Api
public class FlightController {

	@Autowired
	FlightService flightService;


    @ApiOperation(value = "Get all Departures")
	@GetMapping(value="/{all}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Flight>> listAllFlights() {
		return new ResponseEntity<List<Flight>>(flightService.list(), HttpStatus.OK);
	}


    @ApiOperation(value = "List flights by airlines")
	@GetMapping(value = "/{airlines}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Flight>> getFlights(@PathVariable("airlines") String airlines) {
    	List<Flight> flights = new ArrayList<>();
    	flights.add(new Flight());
		return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);
	}

    @ApiOperation(value = "Add a Flight")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
		return new ResponseEntity<Flight>(flight, HttpStatus.CREATED);
	}

	 
}
