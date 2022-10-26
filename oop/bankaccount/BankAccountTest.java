public class BankAccountTest {
  public static void main (String[] args) {
    BankAccount anani = new BankAccount();
    anani.deposit("saving", 100000000.00);
    anani.deposit("checking", 100000000.00);
    anani.withdraw("saving", 100.00);
    anani.genAccountNumber();
    System.out.println(anani.getAccountBalance("saving"));
    System.out.println(anani.getAccountNumber());
    System.out.println(anani.getAccountBalance("checking"));
    System.out.println(anani.totalCashAmount());
  }
}