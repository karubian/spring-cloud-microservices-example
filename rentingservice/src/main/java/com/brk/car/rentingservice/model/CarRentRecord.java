package com.brk.car.rentingservice.model;


//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class CarRentRecord {

    //@Id
    private String id;
    private String carId;
    private String rentType;

    public CarRentRecord(String id, String carId, String rentType) {
        this.id = id;
        this.carId = carId;
        this.rentType = rentType;
    }

    public CarRentRecord() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
