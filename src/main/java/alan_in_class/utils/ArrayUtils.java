package alan_in_class.utils;

public class ArrayUtils {
    public static double calcAverage(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot calculate the average of an empty array.");
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }

    public static void displayArray(int[] numbers) {
        for (int position = 0; position < numbers.length; position++) {
            System.out.println("Position " + position + ": " + numbers[position]);
        }

    }

    public static void displayArray(String[] text) {
        for (int position = 0; position < text.length; position++) {
            System.out.println("Position " + position + ": " + text[position]);
        }
    }
}
