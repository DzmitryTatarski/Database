package com.example.MyProjectWithDatabase.moduls;

import javax.persistence.*;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(name = "SNAME")
    private String name;
    @Column(name = "DURATION")
    private String duration;

    @OneToOne(mappedBy = "idSubject", cascade = CascadeType.ALL)
    private Teacher idTeacher;

    public Subject() {
    }

    public Subject(String name, String duration) {
        this.name = name;
        this.duration = duration;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Teacher getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Teacher idTeacher) {
        this.idTeacher = idTeacher;
    }
}
