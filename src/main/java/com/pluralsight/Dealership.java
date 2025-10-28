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

    public List<Vehicle> getVehiclesByPrice(double min, double max){

        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getPrice() > min && vehicle.getPrice() < max){
                matches.add(vehicle);
            }
        }
        return matches;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                matches.add(vehicle);
            }
        }
        return matches;
    }public List<Vehicle> getVehiclesByYear(int min, int max){
        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getYear() > min && vehicle.getYear() < max){
                matches.add(vehicle);
            }
        }
        return matches;
    }public List<Vehicle> getVehiclesByColor(String color){
        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getColor().equalsIgnoreCase(color)){
                matches.add(vehicle);
            }
        }
        return matches;
    }public List<Vehicle> getVehiclesByMileage(int min, int max){
        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getOdometer() > min && vehicle.getOdometer() < max){
                matches.add(vehicle);
            }
        }
        return matches;
    }public List<Vehicle> getVehiclesByType(String vehicleType){
        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
                matches.add(vehicle);
            }
        }
        return matches;
    }public List<Vehicle> getAllVehicles(){

        return inventory;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
        DealershipFileManager.saveDealership(this, "Files/inventory.csv");
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
        DealershipFileManager.saveDealership(this, "Files/inventory.csv");
    }
    public String getDealershipFileHeader() {
        return name + "|" + address + "|" + phone;
    }


}
