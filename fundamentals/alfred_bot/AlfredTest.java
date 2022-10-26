import java.util.ArrayList;
public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );


        // Print the greetings to test.
        System.out.println(testGreeting);

        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        String[] fruits = {"banana", "pear", "papaya", "kiwi"};
        // To swap the value at index 0 and index 3
        String temp = fruits[0]; // assigns temp to "banana"
        fruits[0] = fruits[3]; // { "kiwi", "pear", "papaya", "kiwi"}
        fruits[3] = temp; // { "kiwi", "pear", "papaya", "banana"}copy
        System.out.println(fruits.length);
        System.out.println(fruits[0]);
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Pretzels");
        snacks.add("Almonds");
        snacks.add("Yogurt");
        for(String snack : snacks ) {
            if(snack.charAt(0) == 'A') {
                snacks.remove(snack);
	}
}

    }
}
