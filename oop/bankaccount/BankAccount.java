import java.util.UUID;
public class BankAccount {
  private double checkingAccount;
  private double savingsAccount;
  private UUID accountNumber;
  public static int numberOfAccounts = 0;
  public static double captialTotal;

  public BankAccount() {
    this.accountNumber = this.genAccountNumber();
    this.numberOfAccounts++;
  }
  public void deposit(String account ,double amount) {
    if (account.equals("checking")) {
      this.checkingAccount += amount;
      this.captialTotal += amount;
    }
    else if (account.equals("saving")) {
      this.savingsAccount += amount;
      this.captialTotal += amount;
    } else {
      System.out.print("Invalid account");
    }
  }

  public void withdraw(String account ,double amount) {
    if (account.equals("checking")) {
      this.checkingAccount -= amount;
      this.captialTotal -= amount;
    }
    else if (account.equals("saving")) {
      this.savingsAccount -= amount;
      this.captialTotal -= amount;
    } else {
      System.out.print("Invalid account");
    }
  }
  public double getAccountBalance(String account) {
    if (account.equals("checking")) {
      return this.checkingAccount;
    }
    else {
      return this.savingsAccount;
    }
  }
  public double totalCashAmount() {
    return this.captialTotal;
    }
  public UUID genAccountNumber(){
    UUID id= UUID.randomUUID();
    return id;
  }
  public UUID getAccountNumber() {
    return this.accountNumber;
  }

}
