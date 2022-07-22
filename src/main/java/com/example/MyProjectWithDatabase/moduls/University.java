package com.example.MyProjectWithDatabase.moduls;

import javax.persistence.*;

@Entity
@Table(name = "UNIVERSITY")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(name = "UNAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;

    @ManyToOne(fetch = FetchType.EAGER)
    private City city;

    public University() {
    }

    public University(String name, String address, City city) {
        this.name = name;
        this.address = address;
        this.city = city;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
