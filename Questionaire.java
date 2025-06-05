

import java.util.Scanner;

public class Questionaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
            "1. Is the sky blue?",
            "2. Do cats bark?",
            "3. Is water wet?",
            "4. Do fish live in the ocean?",
            "5. Can birds fly?",
            "6. Is fire cold?",
            "7. Do apples grow on trees?",
            "8. Is 2 + 2 = 4?",
            "9. Can you eat rocks?",
            "10. Is the sun hot?"
        };

        System.out.println("Choose 'true' or 'false' for the following questions:");

        for (String question : questions) {
            System.out.println(question);
            String choice = input.next().toLowerCase();

            if (!choice.equals("true") && !choice.equals("false")) {
                System.out.println("Oops! That's not a valid answer. Try again.");
            }
        }

        System.out.println("You're done! That was fun!");
    }
}  




i