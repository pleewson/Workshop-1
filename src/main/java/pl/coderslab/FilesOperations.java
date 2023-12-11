package pl.coderslab;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesOperations {

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


    public static void saveToFile() {
        Path path = Paths.get("TEST.txt");
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
