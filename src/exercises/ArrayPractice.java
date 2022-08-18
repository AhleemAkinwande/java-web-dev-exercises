package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8
        int[] intArray = {1, 1, 2, 3, 5, 8};

        //Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for (int i : intArray) {
            if (i % 2 != 0) {
                //Print the array of words to verify that your code works. The syntax is:
                System.out.println(i);
            }
        }

        //For this exercise, use the string I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. Use the split method to divide the string at each space and store the individual words in an array. If you need to review the method syntax, look back at the String methods table.
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] arrayFromPhrase = phrase.split(" ");
        //Print the array of words to verify that your code works. The syntax is:
        System.out.println(Arrays.toString(arrayFromPhrase));
        //Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        String [] sentencesFromPhrase = phrase.split("\\.");
        System.out.println(Arrays.toString(sentencesFromPhrase));

    }
}