package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;

public class test {

    public static void main(String[] args) {


        String[][] testArray = {{"1", "1", "1"},
                {"2","2","2"},
                {"3","3","3"}};

        testArray = ArrayUtils.remove(testArray,1);

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < testArray[i].length; j++) {
                System.out.print(testArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}