package alan_in_class.Week_1_Exercises;

import java.util.Scanner;

public class CalcMax {
    static Scanner input = new Scanner(System.in);

    public static int getValidInteger(String userInput) {
        System.out.print(userInput);
        while (!input.hasNextInt()) {
            System.out.println("Not a number. Try again.");
            input.next();
            System.out.print(userInput);
        }

        return input.nextInt();
    }

    public static int findMax(int firstNum, int secondNum, int thirdNum) {
        int largest = firstNum;

        if (secondNum > largest) {
            largest = secondNum;
        }

        if (thirdNum > largest) {
            largest = thirdNum;
        }

        return largest;
    }

    public static int findMax(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main() {
        int num1 = getValidInteger("Please enter the first number: ");
        int num2 = getValidInteger("Please enter the second number: ");
        int num3 = getValidInteger("Please enter the third number: ");

        int largest = findMax(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
    }

}
