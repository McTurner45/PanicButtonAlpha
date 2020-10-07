package com.danielkim.soundrecorder.Model;

public class Clients {

    String name;
    String id;
    String currentlocation;

    public Clients(String name, String id, String currentlocation) {
        this.name = name;
        this.id = id;
        this.currentlocation = currentlocation;
    }

    public Clients() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrentlocation() {
        return currentlocation;
    }

    public void setCurrentlocation(String currentlocation) {
        this.currentlocation = currentlocation;
    }
}
