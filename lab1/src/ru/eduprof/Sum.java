package ru.eduprof;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> Arr = new ArrayList<>();
        System.out.println("Vvedi 3 chisla");
        for (int i = 0; i < 3; i++) {
            Arr.add(input.nextInt());
        }
        System.out.println("VVedennie chisla");
        System.out.println(Arr);
        System.out.println("Summa = " + calc(Arr));
    }
    public static int calc(List<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}