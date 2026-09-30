package alan_in_class.utils;

import java.util.Scanner;

public class InputUtility {
    private static final Scanner INPUT = new Scanner(System.in);

    public static int getValidInteger(String prompt) {
        System.out.print(prompt);

        while (!INPUT.hasNextInt()) {
            System.out.println("Not a number. Try again.");
            INPUT.next();
            System.out.print(prompt);
        }

        return INPUT.nextInt();
    }
}
