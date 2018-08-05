package com.ohservices.ohservices;

public class ServiceProvider {

    String name;
    String hours;
    String address;

    public ServiceProvider(String name, String hours, String address) {
        this.name = name;
        this.hours = hours;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getHours() {
        return hours;
    }

    public String getAddress() {
        return address;
    }
}
