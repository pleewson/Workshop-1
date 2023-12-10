package pl.coderslab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifications {
    static String[][] mainArray = new String[1][3];


    public static void increaseArray() {
        mainArray = Arrays.copyOf(mainArray, mainArray.length + 1);
    }

    public static void addToArray() {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Insert description: ");
        sb.append(scan.nextLine()).append(",");

        System.out.println("Insert data: ");
        sb.append(scan.nextLine()).append(",");

        System.out.println("Does this task is important? ");
        sb.append(scan.nextLine()).append(",");

        mainArray[mainArray.length - 1] = sb.toString().split(",");

    }

    public static void printArray() {
        for (int i = 0; i < mainArray.length; i++) {
            System.out.println();
            for (int j = 0; j < mainArray[i].length; j++) {
                System.out.print(mainArray[i][j] + " ");
            }
        }
        System.out.println();

    }


}


