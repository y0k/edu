package ru.eduprof;

public class Aspirant extends Student {

    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;

    }

    @Override
    public int getScholarship() {
        int otl = 200;
        int other = 180;
        if(averageMark == 5) {
            return otl;
        } else return other;
    }
}
