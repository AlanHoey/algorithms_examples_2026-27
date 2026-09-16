package alan_in_class.Week_1_Exercises;

import java.util.Scanner;

public class CalcMax {
    public static int getValidInteger(Integer userInput) {
        Scanner input = new Scanner(System.in);

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
}

