package com.fortech.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by iosifvarga on 07.07.2017.
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name="client")
public class Client {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="surname")
    private String surname;

    @NotNull
    @Column(name="age")
    private int age;

    @NotNull
    @Column(name="email", unique = true)
    private String email;

    @NotNull
    @Column(name="created")
    private Date created;

    public Client() {
    }

    public Client(String name, String surname, int age, String email, Date created) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.created = created;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name=\"" + name + '\"' +
                ", surname=\"" + surname + '\"' +
                ", age=" + age +
                ", email=\"" + email + '\"' +
                ", created=\"" + created.getTime() + '\"' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
