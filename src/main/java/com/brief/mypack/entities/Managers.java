package com.brief.mypack.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table
public class Managers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "managerId")
    private int managerId;
    @Basic
    @Column(name = "fullName")
    private String fullName;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "city")
    private String city;
    @OneToMany(mappedBy = "managersByManagerId")
    private Collection<Trips> tripsByManagerId;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "adminId", referencedColumnName = "adminId", insertable = false, updatable =false)
    private Admins adminsByAdminId;

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Collection<Trips> getTripsByManagerId() {
        return tripsByManagerId;
    }

    public void setTripsByManagerId(Collection<Trips> tripsByManagerId) {
        this.tripsByManagerId = tripsByManagerId;
    }

    public Admins getAdminsByAdminId() {
        return adminsByAdminId;
    }

    public void setAdminsByAdminId(Admins adminsByAdminId) {
        this.adminsByAdminId = adminsByAdminId;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "managerId=" + managerId +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", tripsByManagerId=" + tripsByManagerId +
                ", adminsByAdminId=" + adminsByAdminId +
                '}';
    }
}
