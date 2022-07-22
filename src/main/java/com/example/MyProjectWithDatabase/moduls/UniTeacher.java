package com.example.MyProjectWithDatabase.moduls;

import com.example.MyProjectWithDatabase.moduls.compaundKeys.UniTeacherId;

import javax.persistence.*;

@Entity
@Table(name = "UNITEACHER")
public class UniTeacher {

    @EmbeddedId
    private UniTeacherId uniTeacherId;

    @Column(name = "WAGE")
    private int wage;

    public UniTeacher() {
    }

    public UniTeacher(int wage) {
        this.wage = wage;
    }

    public UniTeacherId getUniTeacherId() {
        return uniTeacherId;
    }

    public void setUniTeacherId(UniTeacherId uniTeacherId) {
        this.uniTeacherId = uniTeacherId;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
