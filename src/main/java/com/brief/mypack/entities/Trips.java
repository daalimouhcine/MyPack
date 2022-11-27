package com.brief.mypack.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table
public class Trips {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tripId")
    private int  tripId;
    @Basic
    @Column(name = "start")
    private String start;
    @Basic
    @Column(name = "end")
    private String end;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "managerId", referencedColumnName = "managerId", insertable = false, updatable =false)
    private Managers managersByManagerId;
    @OneToMany(mappedBy = "tripsByTripId")
    private Collection<Colis> colisByTripId;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "driverId", referencedColumnName = "driverId", insertable = false, updatable =false)
    private Drivers driversByDriverId;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Managers getManagersByManagerId() {
        return managersByManagerId;
    }

    public void setManagersByManagerId(Managers managersByManagerId) {
        this.managersByManagerId = managersByManagerId;
    }

    public Collection<Colis> getColisByTripId() {
        return colisByTripId;
    }

    public void setColisByTripId(Collection<Colis> colisByTripId) {
        this.colisByTripId = colisByTripId;
    }

    public Drivers getDriversByDriverId() {
        return driversByDriverId;
    }

    public void setDriversByDriverId(Drivers driversByDriverId) {
        this.driversByDriverId = driversByDriverId;
    }

    @Override
    public String toString() {
        return "Trips{" +
                "tripId=" + tripId +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", managersByManagerId=" + managersByManagerId +
                ", colisByTripId=" + colisByTripId +
                ", driversByDriverId=" + driversByDriverId +
                '}';
    }
}
