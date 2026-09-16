package alan_in_class.Week_1_Exercises;

import java.util.Scanner;

public class Ex1Loop {
    static void main(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;

        while (number != -1) {
            System.out.println("please enter numbers. Enter -1 to terminate: ");
            number = input.nextInt();
            if (number != -1) {
                sum = sum + number;
                count = count + 1;
            }
        }

        int average = sum/count;
        System.out.println("The sum of the numbers is:" + sum);
        System.out.println("The average of the numbers is:" + average);

        }
    }

