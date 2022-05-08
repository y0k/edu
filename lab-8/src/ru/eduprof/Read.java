package ru.eduprof;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read extends Io implements Readable {

    Read(String write, String reed) {
        super(write, reed);
    }
    @Override
    public void read(Read... reads) {
        String inputFileName = "D:\\file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return this.read;
    }
    @Override
    public void setWrite(String write) {
        super.setWrite(read);
    }
}