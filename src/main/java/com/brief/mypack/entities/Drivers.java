package com.brief.mypack.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table
public class Drivers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "driverId")
    private int driverId;
    @Basic
    @Column(name = "fullName")
    private String fullName;
    @Basic
    @Column(name = "vehicleType")
    private String vehicleType;
    @OneToMany(mappedBy = "driversByDriverId")
    private Collection<Trips> tripsByManagerId;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Collection<Trips> getTripsByManagerId() {
        return tripsByManagerId;
    }

    public void setTripsByManagerId(Collection<Trips> tripsByManagerId) {
        this.tripsByManagerId = tripsByManagerId;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "driverId=" + driverId +
                ", fullName='" + fullName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", tripsByManagerId=" + tripsByManagerId +
                '}';
    }
}
