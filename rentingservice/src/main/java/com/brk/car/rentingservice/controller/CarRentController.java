package com.brk.car.rentingservice.controller;

import com.brk.car.rentingservice.model.CarRentRecord;
import com.brk.car.rentingservice.service.CarRentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/cars/{carId}/carRentRecords")
public class CarRentController {
    private CarRentService carRentService;

    public CarRentController(CarRentService carRentService) {
        this.carRentService = carRentService;
    }
    @RequestMapping(value = "/{carRentRecordId}",method = RequestMethod.GET)
    public CarRentRecord getCarRentRecords(@PathVariable("carId") String carId,@PathVariable("carRentRecordId") String carRentRecordId) {
    return new CarRentRecord(carRentRecordId,carId,"ENTERPRISE");    }
}
