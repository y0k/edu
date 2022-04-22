package ru.eduprof;

import java.util.ArrayList;
import java.util.List;

public class MultMass {
    public static void main(String[] args) {
        System.out.println(sums());
    }

    public static int sums() {
        int sum = 0;
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (int d : nums) {
            sum += d;
        }
        return sum;
    }
}