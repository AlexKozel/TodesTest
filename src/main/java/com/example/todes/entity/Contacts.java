package com.example.todes.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class Contacts {

    @Id
    private int id;
    private String phone;
    private String mail;
    private String skype;
    private String git;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", skype='" + skype + '\'' +
                ", git='" + git +
                '}';
    }
}
