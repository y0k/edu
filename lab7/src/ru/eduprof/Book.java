package ru.eduprof;

public class Book {
    String namebook;
    int index;
    boolean outOfDate;
    public Book(String name, Integer index, boolean out) { this.namebook = name; this.index = index; this.outOfDate = out;}

    public String getNameBook() {
        return namebook;
    }

}


