package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesOperations {

    public static void readFile() {
        Path path = Paths.get("task.csv");
        File file = new File("task.csv");

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println(Colors.GREEN + "Created new file - task.csv" + Colors.RESET);
            }

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

            if (ArrayModifications.mainArray.length == 1 && ArrayModifications.mainArray[0][0] == null) {
                ArrayModifications.mainArray = ArrayUtils.remove(ArrayModifications.mainArray, ArrayModifications.mainArray.length - 1);
            }

        } catch (IOException ex) {
            System.out.println("error ocurate " + ex.getMessage());
        }

        System.out.println(Colors.GREEN + "Files has been read" + Colors.RESET);
    }


    public static void saveToFile() {
        Path path = Paths.get("task.csv");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ArrayModifications.mainArray.length; i++) {
            for (int j = 0; j < ArrayModifications.mainArray[i].length; j++) {
                sb.append(ArrayModifications.mainArray[i][j]).append(",");
            }
            sb.append("\n");
        }

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.writeString(path, sb.toString());
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }
}
