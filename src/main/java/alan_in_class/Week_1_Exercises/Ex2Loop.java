package alan_in_class.Week_1_Exercises;
import java.util.Scanner;

public class Ex2Loop {
    public static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        int start = Math.min(first, second);
        int end = Math.max(first, second);
        int sum = 0;

        for (int number = start; number <= end; number++) {
            sum += number;
        }

        System.out.println("The sum is: " + sum);
        input.close();
    }
}
