package ru.eduprof;

import java.io.*;

public class Merge extends Io implements Mergable {
    Merge(String write, String read) {
        super(write, read);
    }
    @Override
    public void merge(Merge... merges) {

        try {
            FileInputStream input = new FileInputStream("D:\\file.txt");
            FileOutputStream output = new FileOutputStream("D:\\file0.txt",true);

            while(input.available() > 0) {
                int data = input.read();
                output.write(data);
            }

            input.close();
            output.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
