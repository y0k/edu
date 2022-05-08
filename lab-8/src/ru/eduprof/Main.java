package ru.eduprof;


public class Main {
    public static void main(String[] args) {
        Create create = new Create("C", "c");
        create.create();
        Write write = new Write("W", "w");
        write.write();
        System.out.println(write);
        Read read = new Read("R","r");
        read.read();
        Merge merg = new Merge("M","m");
        merg.merge();
    }
}
