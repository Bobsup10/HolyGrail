import java.util.Scanner;

/**
 * Simple I/O project using scanner
 * @version 9/23/22
 * @author 24rossilli
 */
public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args command line arguments, if needed.
     */

    public static void main(String[] args) {
        // declaring local variable
        String name, quest, color;
        Scanner in = new Scanner(System.in);
        System.out.println("* A chat with a bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your quest? ");
        quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        color = in.nextLine();
        System.out.println("King Arthur says, \"You have to know these things when you're a " +
                "king, you know.\"");
        System.out.println("Your name is: " + name );
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
    }
}
