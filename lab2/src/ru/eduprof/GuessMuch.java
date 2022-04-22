package ru.eduprof;

import java.util.Random;
import java.util.Scanner;

public class GuessMuch {
    public static void main(String[] args) throws Exception {
        System.out.println("Igraem");
        int compNumber = random();
        int count = 0;
        while (count < 3) {
            int humNumber = scan();
            if (humNumber == compNumber) {
                System.out.println("Вы выиграли");
                break;
            } else if (humNumber > compNumber) {
                System.out.println("Mnogo na sebya beresh");
            } else if (humNumber < compNumber) {
                System.out.println("Malovato dumaesh");
                count++;
            }
        }
        System.out.println("END GAME");
    }

    public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(10) + 1;
        return randoNumber;
    }

    public static int scan() throws Exception {
        System.out.println("Введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = 0;
        if (scanner.hasNextInt()) {
            humanNumber = scanner.nextInt();
        } else {
            throw new Exception();
        }
        return humanNumber;
    }
}



