package com.example.MyProjectWithDatabase.tools;

import com.example.MyProjectWithDatabase.control.repo.GroupRepo;
import com.example.MyProjectWithDatabase.moduls.City;
import com.example.MyProjectWithDatabase.moduls.Group;
import com.example.MyProjectWithDatabase.moduls.University;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GroupTools {

    public static List<Group> createGroupList(City city, University university, int numberOfGroups){
        List<Group> list = new ArrayList<>();
        for (int i = 0; i < numberOfGroups; i++) {
            list.add(new Group(getGroupName(city, university, i + 1), university));
        }
        return list;
    }

    public static int getDefinedGroup(){
        return 1;
    }

    public static String getGroupName(City city, University university, int numberGroupInUniversity){
        return String.valueOf(city.getId()) + university.getId() + numberGroupInUniversity;
    }
}
