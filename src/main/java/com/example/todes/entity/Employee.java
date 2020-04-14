package com.example.todes.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String patronymic;
    @Column(name = "birth_date")
    private LocalDate birthate;
    private Boolean gender;

    @OneToMany(mappedBy = "employee", fetch=FetchType.EAGER)
    private Set<Contacts> contacts;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
    @JoinTable(
            name = "employee_stack",
            joinColumns = { @JoinColumn (name = "employee_id")},
            inverseJoinColumns = {@JoinColumn (name = "stack_id")})
    private Set<Stack> stacks;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthate=" + birthate + '\'' +
                ", gender=" + gender +" "+  contacts +
                " " + stacks +
                '}';
    }
}
