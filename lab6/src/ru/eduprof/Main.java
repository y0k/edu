package ru.eduprof;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stds = new ArrayList<>();
        stds.add(new Student("Bender", "RAMOVICH", "b1", 5));
        stds.add(new Student("GOR", "KIY", "c3", 4.999));
        stds.add(new Aspirant("RAMA", "FUTU", "a1", 5, "Work1"));
        stds.add(new Aspirant("DON", "SILENT", "a2", 3.0001, "Work12"));
        Iterator itr=stds.iterator();
        for (int i = 0; i < stds.size(); i++) {
            Student st = (Student) itr.next();
            System.out.println(st.firstName + " " + st.lastName + " "
                    + st.group + " " + st.averageMark);
            System.out.println(st.getScholarship());
        }


        }

    }

