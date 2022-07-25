package com.example.MyProjectWithDatabase.moduls;

import javax.persistence.*;

@Entity
@Table(name = "TEACHER")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "PHONE")
    private int phone;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SUBJECT")
    private Subject subject;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, int phone,Subject subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
