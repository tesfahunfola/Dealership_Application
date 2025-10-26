package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory;

    public Dealership(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Dealership(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicleByPrice(double min, double max){

        return getVehicleByPrice(min, max);
    }
    public List<Vehicle> getVehicleByMakeModel(String make, String model){

        return getVehicleByMakeModel(make, model);
    }public List<Vehicle> getVehicleByYear(int min, int max){

        return getVehicleByYear(min, max);
    }public List<Vehicle> getVehicleByColor(String color){

        return getVehicleByColor(" ");
    }public List<Vehicle> getVehicleByMileage(int min, int max){

        return getVehicleByMileage(min,max);
    }public List<Vehicle> getVehicleByType(String vehicleType){

        return getVehicleByType("");
    }public List<Vehicle> getAllVehicles(){

        return getAllVehicles();
    }

}
