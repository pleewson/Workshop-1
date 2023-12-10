package pl.coderslab;

import java.util.Arrays;

public class ArrayModifications {
    static String[][] mainArray = new String[1][3];


    public static void increaseArray() {
        mainArray = Arrays.copyOf(mainArray, mainArray.length + 1);
    }

    public static void printArray() {
        System.out.println("printArray - method:");
        for(int i = 0; i < mainArray.length; i++){
            System.out.println();
            for(int j = 0; j < mainArray[i].length; j++){
                System.out.print(mainArray[i][j] + " ");
            }
        }

    }


}


