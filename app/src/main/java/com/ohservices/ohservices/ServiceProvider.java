package com.ohservices.ohservices;

public class ServiceProvider {

    String name;
    String rent;

    public ServiceProvider(String name, String rent) {
        this.name = name;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }
    public String getRent() {
        return rent;
    }
}
