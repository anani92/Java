import java.util.Scanner;

public class TakeOutSimulator {
    private Customer customer;
    private FoodMenu menu;
    private Scanner input;

    public TakeOutSimulator(Customer customer, FoodMenu menu, Scanner input) {
        this.customer = customer;
        this.menu = menu;
        this.input = input;
    }

    // getters and setters for class fields
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FoodMenu getMenu() {
        return menu;
    }

    public void setMenu(FoodMenu menu) {
        this.menu = menu;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever<T> intUserInputRetriever) {
        while (true) {
            System.out.print(userInputPrompt);
            if (input.hasNextInt()) {
                int userIntSelection = input.nextInt();
                if (userIntSelection >= 0 && userIntSelection <= menu.getMenuItemCount()) {
                    return intUserInputRetriever.produceOutputOnIntUserInput(userIntSelection);
                } else {
                    System.out.print("Invalid entry. ");
                }
            } else {
                input.next();
                System.out.print("Invalid entry. ");
            }
        }
    }

    public boolean shouldSimulate() {
        String userPrompt = "Please type 1 to PROCEED or 0 to STOP the simulation...\n";
        IntUserInputRetriever<Boolean> intUserInputRetriever = (selection) -> {
            if (selection == 1 && customer.getMoney() >= menu.getLowestCostFood().getPrice()) {
                System.out.printf("Your choice was %s to proceed, and you've got some cash - nice! Let us continue...%n", selection);
                return true;
            } else if (selection == 1 && customer.getMoney() < menu.getLowestCostFood().getPrice()) {
                System.out.printf("Your choice was %s, but... SORRY!\n", selection);
                System.out.println("You do not have enough money to continue shopping (only $" + customer.getMoney() + "), so go and find a better job. END OF SIMULATION...");
                return false;
            } else if (selection == 0) {
                System.out.printf("You've chosen %s, as you wish!\nSIMULATION ENDING...", selection);
                return false;
            } else {
                throw new IllegalArgumentException("The provided selection (" + selection + ") is invalid, please try again...\n");
            }
        };

        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public Food getMenuSelection() {
        String userPrompt = "Choose a menu item or enter 0 to checkout: ";
        IntUserInputRetriever<?> intUserInputRetriever = (selection) -> {
            if (selection  > 0 && selection <= menu.getMenuItemCount()) {
                return menu.getFood(selection - 1);
            } else if (selection == 0) {
                return null;
            } else {
                throw new IllegalArgumentException("The provided selection (" + selection + ") is invalid, please try again...\n");          }
        };
        return  (Food) getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public Boolean isStillOrderingFood() {
        String userPrompt = "press 1 to continue or enter 0 to checkout: ";
        IntUserInputRetriever<?> intUserInputRetriever = (selection) -> {
            if (selection == 1) {
                return true;
            } else if (selection == 0) {
                return false;
            } else {
                throw new IllegalArgumentException("The provided selection (" + selection + ") is invalid, please try again...\n");
            }
        };
        return (Boolean) getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }
    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        System.out.println("processing payment");
        Integer total = 0;
        for (Food food: shoppingBag.getBag().keySet()) {
            Integer count = shoppingBag.getBag().get(food);
            total += count * food.getPrice();
        }

        customer.setMoney(customer.getMoney() - shoppingBag.getTotalPrice());
        System.out.println("total cost: "+ total + "$");
        System.out.println("your remaining balance: " + customer.getMoney());
        System.out.println("Thank you and enjoy your food!");
    }

    public void takeOutPrompt() {
        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();
        int customerMoney = customer.getMoney();
        System.out.println("\nYou have $" + customerMoney + " to spend.");
        System.out.println(menu);
        while(true) {
            Food item = getMenuSelection();
            if (item != null && customerMoney >= item.getPrice()) {
                customerMoney -= item.getPrice();
                shoppingBag.addItem(item);
                System.out.println("Added " + item.getName() + " to your order. " +
                        "You have $" + customerMoney + " to spend.");
            } else if  (item == null) {
                break;
            } else {
                System.out.println("Balance is too low to add item.");
            }
        }
        checkoutCustomer(shoppingBag);
    }
    public void startTakeOutSimulator() {
        System.out.println("Hello, welcome to my restaurant");
        shouldSimulate();
        takeOutPrompt();
    }


}
