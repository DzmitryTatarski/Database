package com.example.MyProjectWithDatabase.moduls;

import com.example.MyProjectWithDatabase.tools.Bursary;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "dd.mm.yyyy")
    private Date birthday;
    @Column(name = "AVERAGE_MARK")
    private int averageMark;
    @Column(name = "BURSARY")
    private int bursary;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Group group;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private City city;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private University university;

    public Student() {
    }

    public Student(String firstName, String lastName, Date birthday, int averageMark, University university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.averageMark = averageMark;
        this.university = university;
        this.bursary = Bursary.setBursary(averageMark);
        this.city = university.getCity();
//        this.group =
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public int getBursary() {
        return bursary;
    }

    public void setBursary(int bursary) {
        this.bursary = bursary;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
