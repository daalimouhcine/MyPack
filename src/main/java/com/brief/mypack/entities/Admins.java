package com.brief.mypack.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table
public class Admins {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "adminId")
    private int adminId;
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
    @OneToMany(mappedBy = "adminsByAdminId")
    private Collection<Managers> managersByAdminId;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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

    public Collection<Managers> getManagersByAdminId() {
        return managersByAdminId;
    }

    public void setManagersByAdminId(Collection<Managers> managersByAdminId) {
        this.managersByAdminId = managersByAdminId;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "adminId=" + adminId +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", managersByAdminId=" + managersByAdminId +
                '}';
    }
}
