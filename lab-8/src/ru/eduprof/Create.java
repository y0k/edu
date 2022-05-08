package ru.eduprof;

import java.io.File;

public class Create extends Io implements Creatable {

    Create(String write, String read) {
        super(write, read);
    }

    @Override
    public void create(File... files) {
        int i;
        for (i = 0; i < 2; i++) {

            try {
                File f = new File("D:\\file" + i++ + ".txt");
                if (f.createNewFile())
                    System.out.println("File created");
                else
                    System.out.println("File already exists");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}
