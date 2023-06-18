package Pack1;

import java.util.Scanner;

public class OverloadedMethods {

    public static int myOverloadedMethod(int number) {
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        return digit1 + digit2 + digit3;
    }

    public static int myOverloadedMethod(String word1, String word2) {
        return word1.length() + word2.length();
    }

    public static boolean myOverloadedMethod(boolean isPositive) {
        if (isPositive) {
            System.out.println("Number is greater than 0.");
            return true;
        } else {
            System.out.println("Number is less than or equal to 0.");
            return false;
        }
    }

    public static void main(String[] args) {
        // Call method #1
        int number = 333;
        int sumOfDigits = myOverloadedMethod(number);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Call method #2
        String word1 = "WHAT'S";
        String word2 = "UP?";
        int sumOfWordsLengths = myOverloadedMethod(word1, word2);
        System.out.println("Sum of lengths of words: " + sumOfWordsLengths);

        // Call method #3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        boolean isPositive = userInput > 0;
        boolean result = myOverloadedMethod(isPositive);
        System.out.println("Result: " + result);


    }
}
