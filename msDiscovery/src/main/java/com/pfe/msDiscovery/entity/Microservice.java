package com.pfe.msDiscovery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "microservices")
public class Microservice {

    @Id
    @GeneratedValue
    private int id;
    private String keys;
    private String address;
    private float version;

    public Microservice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AddMsCommandDto{" +
                "id=" + id +
                ", keys='" + keys + '\'' +
                ", address='" + address + '\'' +
                ", version=" + version +
                '}';
    }
}
