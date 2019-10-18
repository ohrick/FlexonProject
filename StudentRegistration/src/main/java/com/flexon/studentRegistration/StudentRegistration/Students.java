package com.flexon.studentRegistration.StudentRegistration;

enum Gender {
    FEMALE, MALE;
}

public class Students {
    private String name;
    private String stdId;
    private Gender gender;
    private String degree;
    private String contact;
    private String email;

    public Students(){}

    public Students(String n, String id){//, String g, String d, String c, String e) {
        //if (!e.contains("@")) throw new IllegalArgumentException("invalid email address: " + e);
        this.name = n;
        this.stdId = id;
        //this.gender = Gender.valueOf(g);
        //this.degree = d;
        //this.contact = c;
        //this.email = e;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.stdId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(String newId) {
        this.stdId = newId;
    }

}
