package com.brief.mypack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admins")
public class AdminEntity extends User{
}
