package alan_in_class;

import java.util.Scanner;

public class Exercise {
    static void main() {
        System.out.println("Please enter your age");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("hello there, " + name);

        if(name.equals("admin")){
            System.out.println("you're banned, get out!");
        }

        else {
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible to vote.");
        } else if (age < 25) {
            System.out.println("No rental car for you");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}}