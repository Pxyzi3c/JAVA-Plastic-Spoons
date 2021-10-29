import java.util.Scanner;
public class PlasticSpoons{
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args) {
        // Variables declaration
        int num1, num2;
        double num3, num4;
        String word1, word2, lineOfText;

        Scanner keyboard = new Scanner(System.in); // Scanner assignment
        
        // Input two whole numbers
        System.out.println("Enter the whole numbers \nseparated by one or more spaces");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        System.out.printf("You have entered %d and %d\n", num1, num2); // Display two whole numbers typed by the user
        
        // Input two numbers which can be have a decimal point
        System.out.println("Next enter two numbers. \nA decimal point is OK.");
        num3 = keyboard.nextFloat();
        num4 = keyboard.nextFloat();
        System.out.printf("You have entered %.2f and %.1f\n", num3, num4); // Display two numbers which may have decimal point entered

        // Input two words
        System.out.println("Next enter two words");
        word1 = keyboard.next();
        word2 = keyboard.nextLine();
        System.out.printf("You have entered \"%s\" and \"%s\"\n", word1, word2); // Display the two words entered
        
        // Input a line of text
        System.out.println("Next enter a line of text:");
        lineOfText = keyboard.nextLine();
        System.out.print("You entered \"" + lineOfText + "\""); // Display the line of text entered
    }
}