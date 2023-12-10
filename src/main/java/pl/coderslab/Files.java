package pl.coderslab;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public static void readFile() {
        File file = new File("/Users/adrianplewa/Documents/GitHub/TaskManager/src/tasks.csv");

        try {
            Scanner scan = new Scanner(file);

            int i = 0;

            while (scan.hasNextLine()) {
                String temp = scan.nextLine();
                ArrayModifications.mainArray[i] = temp.split(",");

                i++;

                if (scan.hasNextLine()) {
                    ArrayModifications.increaseArray();
                }
            }

        } catch (IOException ex) {
            System.out.println("error ocurate " + ex.getMessage());
        }

        System.out.println(Colors.GREEN + "Files have been read" + Colors.RESET);

    }


}
