package com.brief.mypack.entities;

import com.brief.mypack.enums.Vehicles;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class DriverEntity {
    @Id
    private int id;
    private String name;
    private Vehicles vehicleType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicles vehicleType) {
        this.vehicleType = vehicleType;
    }
}
