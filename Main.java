import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello, Hunter");
        System.out.print("Hello Gavin");
        System.out.print("Nothing beats a jet2 holiday and right now you can save £50 per person.");
        System.out.print("that's £200 off for a family of 4. we've got millions of free child place holidays ...");
        System.out.print("12345");
        System.out.print("54321");

        // Declare values
        Scanner scanner = new Scanner(System.in);
        String input;

        // Opening conversation
        System.out.println("Welcome to the Fluffy Disco.");
        System.out.println("Are you here for the fluff or the disco?");

        // All options & Input
        System.out.printf("\n Fluff \t \t \t \t Disco \n Fluffy Disco \t \t Neither \n \n > ");
        input = scanner.next();

        // If-else statement 
        // (Three options - if it doesn't match any of the three options, chooses a default response)
        if (input.equalsIgnoreCase("fluffy")) {
            System.out.println("\n Of course, it's so fluffy!");
        } else if (input.equalsIgnoreCase("disco")) {
            System.out.println("\n Sounds like a good time.");
        } else if (input.equalsIgnoreCase("fluffy disco")) {
            System.out.println("\n Yes! Best of both worlds!");
        } else {
            System.out.println("\n... then why are you here?");
        }
        
        // End program - close scanner
        scanner.close();
    }
}
