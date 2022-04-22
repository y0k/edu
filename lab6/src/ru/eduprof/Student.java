package ru.eduprof;

public class Student {

    public Student(String firstName, String lastName, String group, double averageMark)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    String firstName;
    String lastName;
    String group;
    double averageMark;

    public int getScholarship() {
        int otl = 100;
        int other = 80;
        if(averageMark == 5) {
            return otl;
        } else return other;
    }


}
