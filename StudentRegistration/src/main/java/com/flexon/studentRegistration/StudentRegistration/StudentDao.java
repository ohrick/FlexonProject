package com.flexon.studentRegistration.StudentRegistration;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class StudentDao {
    private List<Students> devOpsClass = new ArrayList<>();

    public StudentDao() {
        devOpsClass.add(new Students("Mike", "1234"));
        devOpsClass.add(new Students("David", "3456"));
    }

    public List<Students> displayStudents() {
        return devOpsClass;
    }

    public Students addNewStudents(Students newStudent) {
        devOpsClass.add(newStudent);
        return newStudent;
    }
    public Students printAStudent(String id) {
        Iterator<Students> it = devOpsClass.iterator();
        while (it.hasNext()) {
            Students std = it.next();
            if (std.getId().equals(id)) {
                return std;
            }
        }
        return null;
    }

    public void removeStudents(String id, String name) {
        Iterator<Students> it = devOpsClass.iterator();
        while (it.hasNext()) {
            Students std = it.next();
            if (std.getId().equals(id) && std.getName().equals(name)) {
                devOpsClass.remove(std);
            }
        }
    }

    public void updateStudent(String id, String name) {
        Iterator<Students> it = devOpsClass.iterator();
        while (it.hasNext()) {
            Students std = it.next();
            if (std.getId().equals(id)) {
                std.setName(name);
            }
        }
    }
}
