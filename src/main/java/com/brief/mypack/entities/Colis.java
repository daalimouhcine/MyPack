package com.brief.mypack.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Colis {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cliId")
    private int coliId;
    @Basic
    @Column(name = "category")
    private String category;
    @Basic
    @Column(name = "weight")
    private int weight;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "clientCity")
    private String clientCity;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "cliId", referencedColumnName = "cliId", insertable = false, updatable =false)
    private Trips TripsByTripId;

    public int getColiId() {
        return coliId;
    }

    public void setColiId(int coliId) {
        this.coliId = coliId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public Trips getTripsByTripId() {
        return TripsByTripId;
    }

    public void setTripsByTripId(Trips tripsByTripId) {
        TripsByTripId = tripsByTripId;
    }

    @Override
    public String toString() {
        return "Colis{" +
                "coliId=" + coliId +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", status='" + status + '\'' +
                ", clientCity='" + clientCity + '\'' +
                ", TripsByTripId=" + TripsByTripId +
                '}';
    }
}
