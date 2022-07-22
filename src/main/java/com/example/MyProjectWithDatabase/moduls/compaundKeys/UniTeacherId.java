package com.example.MyProjectWithDatabase.moduls.compaundKeys;

import com.example.MyProjectWithDatabase.moduls.Teacher;
import com.example.MyProjectWithDatabase.moduls.University;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class UniTeacherId implements Serializable {


    @MapsId("id")
    @ManyToOne
    private Teacher teacher;

    @MapsId("id")
    @ManyToOne
    private University university;

    public UniTeacherId() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
