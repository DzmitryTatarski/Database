package com.example.MyProjectWithDatabase.moduls;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "SNAME")
    private String name;
    @Column(name = "DURATION")
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date duration;

//    @OneToOne(mappedBy = "idSubject", cascade = CascadeType.ALL)
//    private Teacher idTeacher;

    public Subject() {
    }

    public Subject(String name, Date duration) {
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

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

//    public Teacher getIdTeacher() {
//        return idTeacher;
//    }
//
//    public void setIdTeacher(Teacher idTeacher) {
//        this.idTeacher = idTeacher;
//    }
}
