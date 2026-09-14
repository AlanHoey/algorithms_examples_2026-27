package in_class;

import java.util.Scanner;

public class DemoIO {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name = input.nextLine();
        System.out.println("Hello there, " + name);

        if(!name.equals("admin")){
            System.out.println("You're banned, get out!");
        }else {

            System.out.println("Please enter your age: ");
            int age = input.nextInt();

            if (age < 18) {
                System.out.println("You're too young, get out!");
            } else if (age < 25) {
                System.out.println("No car rental for you!");
            } else {
                System.out.println("Welcome in!");
            }
        }
    }
}
