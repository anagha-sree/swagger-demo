package in.stackroute.demo.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Flight ID")
    private String flightid;
    @ApiModelProperty(notes = "Flight Name")
    private String flightName;
    
    @ApiModelProperty(notes = "Arrival Point")
    private String arrivalpoint;
    
    @ApiModelProperty(notes = "Departure Point")
    private String departurepoint;
    
    @ApiModelProperty(notes = "Airlines Name")
    private String airlinesname;
    
    
    public String getFlightid() {
		return flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getArrivalpoint() {
		return arrivalpoint;
	}

	public void setArrivalpoint(String arrivalpoint) {
		this.arrivalpoint = arrivalpoint;
	}

	public String getDeparturepoint() {
		return departurepoint;
	}

	public void setDeparturepoint(String departurepoint) {
		this.departurepoint = departurepoint;
	}

	public String getAirlinesname() {
		return airlinesname;
	}

	public void setAirlinesname(String airlinesname) {
		this.airlinesname = airlinesname;
	}


    
}
