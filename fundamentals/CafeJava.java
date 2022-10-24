public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double cafeLate = 9.0;
        double teaLate = 5.0;
        double cappuccino = 2.22;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(isReadyOrder4?  readyMessage + ", "  + customer4 + displayTotalMessage  + cappuccino: pendingMessage);
        System.out.println(isReadyOrder2? readyMessage + ", "  +  customer2 + displayTotalMessage + (cafeLate * 2): pendingMessage);
        System.out.println(generalGreeting + customer4 + displayTotalMessage + teaLate);

    	// ** Your customer interaction print statements will go here ** //

    }
}
