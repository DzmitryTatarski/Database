package com.example.MyProjectWithDatabase.moduls;

import javax.persistence.*;

@Entity
@Table(name = "UGROUP")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(name = "GNAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private University university;

    public Group() {
    }

    public Group(String name, University university) {
        this.name = name;
        this.university = university;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}
