import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        // 2. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.

        int count = 0;
        do {
            System.out.println("Ask Bob a question.");
            String BobAnswers;
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                BobAnswers = "Sure";
            } else if (userInput.endsWith("!")) {
                BobAnswers = "Whoa, chill out!";
            } else if (userInput.equals("")) {
                BobAnswers = "Fine. Be that way!";
            } else {
                BobAnswers = "Whatever";
            }
            System.out.println(BobAnswers);
            count++;
        } while (count <= 8);

//        talkToBob();
    }

    public static void talkToBob() {
        boolean keepTalking; // boolean for the loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arriving without much aplomb, Bob steps into the room to talk to you with his head down.");
        System.out.println("Keeping his head down, Bob steps past you and slinks down into a sitting position nearby.");
        System.out.println("He takes an AirPod out of his ear thay you had missed and looks up at you bordely.");
        do {
            System.out.println("What would you like to say to Bob?");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                // make Bob say "sure"
                System.out.println("Bob looks at his feet, to the wall, and then finally to your eyes.\n\"Sure\" he says.");
            } else if (userInput.endsWith("!")) {
                //He answers 'Whoa, chill out!'
                System.out.println("His eyes pop open in shock from what you said.\nHe raised his arms up saying \"Whoa, chill out!\"");
            } else if (userInput.equals("")) {
                //He says 'Fine. Be that way!'
                System.out.println("Bob rolls his eyes.\n\"Fine. Be that way!\"");
            } else {
                //He answers 'Whatever.'
                System.out.println("Without adjusting himself, Bob mutters \"Whatever\"");
            }

            System.out.println("Would you like to talk to Bob some more? [yes/no]");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes")) {
                keepTalking = true;
            } else {
                keepTalking = false;
            }
        } while (keepTalking);

    }
}
