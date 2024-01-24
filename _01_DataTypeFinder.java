package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class _01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            char firstSymbol = input.charAt(0);
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.println(input + " is boolean type");
            } else if ((((int) firstSymbol >= 65 && (int) firstSymbol <= 90) ||
                    ((int) firstSymbol >= 97 && (int) firstSymbol <= 122)) && input.length() > 1) {
                System.out.println(input + " is string type");
            } else if (input.length() == 1 && ((int) firstSymbol < 48 || (int) firstSymbol > 57)) {
                System.out.println(input + " is character type");
            } else if (((int) firstSymbol >= 48 && (int) firstSymbol <= 57) || (int) firstSymbol == 45) {

                boolean isDouble = false;
                for (int i = 0; i < input.length(); i++) {
                    char symbol = input.charAt(i);
                    if ((int) symbol == 46) {
                        isDouble = true;
                        break;
                    }
                }
                if (isDouble) {
                    System.out.println(input + " is floating point type");
                } else {
                    System.out.println(input + " is integer type");

                }
            }


            input = scanner.nextLine();
        }

    }
}





