package com.ekaaverinda.aplikasidatabasesqlite.model;

public class Data {
    private String id, name, address;

    public Data() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Data(String id, String name, String addrees) {
        this.id = id;
        this.name = name;
        this.address = addrees;
    }
}
