package pl.coderslab;

import java.util.Scanner;

public class Methods {

    public static void selectOption() {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println(Colors.BLUE + "Please select an option: " + Colors.RESET);
        System.out.println("add");
        System.out.println("remove");
        System.out.println("list");
        System.out.println("exit");

        String input = scan.next();

        switch (input) {
            case "add" -> {
                ArrayModifications.increaseArray();
                ArrayModifications.addToArray();
                Methods.selectOption();
            }
            case "remove" -> System.out.println("remove - method");
            case "list" -> {
                ArrayModifications.printArray();
                Methods.selectOption();
            }
            case "exit" -> System.out.println(Colors.RED + "Bye Bye!" + Colors.RESET);
            default -> {
                System.out.println(Colors.RED + "Incorrect input. Try again.");
                Methods.selectOption();
            }
        }
    }
}
