package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of your rectangle: ");
        Double rectangleLength = Double.valueOf(input.nextLine());
        System.out.println("You entered a length of " + rectangleLength + ". Please your rectangle's width: ");
        Double rectangleWidth = Double.valueOf(input.nextLine());
        Double rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("You entered a length of " + rectangleLength + " and a width of " + rectangleWidth + ". Your rectangle has an area of " + rectangleArea + ".");

    }
}
