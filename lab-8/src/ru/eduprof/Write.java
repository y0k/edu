package ru.eduprof;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Write extends Io implements Writeable {
    Write(String write, String reed) {
        super(write, reed);
    }
    @Override
    public void write(Write... writes) {
        String outputFileName = "D:\\file.txt";
        String outputFileName1 = "D:\\file0.txt";
        String[] array = { "one", "two", "three", "four" };
        String[] array1 = { "SIX", "SEVEN", "EIGHT", "NINE" };

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : array) {
                writter.write(value + " : " +value.length()+"\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName1))) {
            for (String value : array1) {
                writter.write(value + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Write{" +
                "write='" + write + '\'' +
                '}';
    }
}