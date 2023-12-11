package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.InputMismatchException;
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


    public static void removeFromArray() {
        System.out.println();
        System.out.println("Write number that you want remove: ");

        Scanner scan = new Scanner(System.in);
        try {
            int input = scan.nextInt();
            if (input >= 0 && input < mainArray.length) {
                mainArray = ArrayUtils.remove(mainArray, input);
                System.out.println(Colors.YELLOW + "The list of number " + input + " has been deleted" + Colors.RESET);
            } else {
                System.out.println(Colors.RED + "Incorrect input. You must type number of list that you want remove." + Colors.RESET);
            }
        } catch (InputMismatchException ex) {
            System.out.println(Colors.RED + "Incorrect input. Type number of list.");
        }
    }

    public static void printArray() {

        if (mainArray.length == 1 && mainArray[0][0] == null   ||   mainArray.length == 0) {
            System.out.println();
            System.out.println(Colors.YELLOW + "There is nothing on list." + Colors.RESET);
        } else {

            System.out.println();
            for (int i = 0; i < mainArray.length; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < mainArray[i].length; j++) {
                    System.out.print(mainArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}




