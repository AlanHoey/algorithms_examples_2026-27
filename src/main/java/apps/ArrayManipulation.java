package apps;

import alan_in_class.utils.ArrayUtils;
import alan_in_class.utils.InputUtility;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] grades = new int[10];

        for (int position = 0; position < grades.length; position++) {
            grades[position] = InputUtility.getValidInteger(
                    "Enter grade " + (position + 1) + ": "
            );
        }

        double gpa = ArrayUtils.calcAverage(grades);
        System.out.println("GPA: " + gpa);
    }
}
