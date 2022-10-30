public class CalculatorTest {
  public static void main(String[] args) {
    Calculator new_calculator = new Calculator();
    new_calculator.performOperations(20);
    new_calculator.performOperations("+");
    new_calculator.performOperations(5);
    new_calculator.performOperations("*");
    new_calculator.performOperations(5);
    new_calculator.performOperations("+");
    new_calculator.performOperations(1);

    new_calculator.performOperations("=");
    System.out.println(new_calculator.getResults());

  }
}
