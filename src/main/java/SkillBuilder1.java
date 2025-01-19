import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        double spice;
        double spiceValue;

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        userName = input.nextLine();

        System.out.println("Enter a floating-point number:");
        spice = input.nextDouble();

        spiceValue = Math.pow(((2.0)), (Math.sqrt(5.0)/Math.pow(spice, 3.0))) * (4.0/3.0);
        System.out.println("Well " + userName + ", the spice value resulted in " + spiceValue);

        int spiceValue2 = (int)(spiceValue*100.0);
        double spiceValue3 = (double)spiceValue2/100;
        System.out.println("And the converted value is " + spiceValue3);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = wallWidth * wallHeight;
        System.out.println("Wall area: " + (int)wallArea + " square feet");

        double needed = wallArea/squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons%n", needed);
        System.out.println("Cans needed: " + (int)Math.ceil(needed) + " can(s)");

    }
}
