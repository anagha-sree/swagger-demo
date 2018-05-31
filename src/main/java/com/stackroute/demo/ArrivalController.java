package com.stackroute.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping//(value = VERSION + ARRIVAL)
@Api//(value = VERSION + ARRIVAL)
public class ArrivalController {

	/*
   @Autowired
   private ArrivalRepository arrivalRepository;
*/
	
   @ApiOperation(value = "Get all arrivals")
   @GetMapping(value = "all")
   @ResponseBody
   //public List<Arrival> getAllArrivals() {
   public String getAllArrivals() {
	   return "test2";
       //return arrivalRepository.findAll();
   }

  /* @ApiOperation(value = "Get arrival by ID")
   @RequestMapping(value = "{id}", method = GET)
   @ResponseBody
   public Arrival getArrivalById(@PathVariable(value = "id") int id) {
       return arrivalRepository.findAllById(id);
   }*/
}
