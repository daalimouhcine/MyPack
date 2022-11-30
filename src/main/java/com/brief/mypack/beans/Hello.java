package com.brief.mypack.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Named
@RequestScoped
public class Hello {
    private String name;
    private String message;

    public void createMessage() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mypack");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.close();
        emf.close();
        message = "Hello " + name + "!";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }
}
