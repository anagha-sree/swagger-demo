package in.stackroute.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.stackroute.demo.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, String>{

}
