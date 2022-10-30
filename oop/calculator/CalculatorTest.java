public interface CalculatorTest {
  public static void main(String[] args) {
    Calculator cal  = new Calculator();
    cal.setOperation("+");
    cal.setOperandOne(50.4);
    cal.setOperandTwo(20.4);
    cal.performOperation();
    cal.getResults();
    System.out.println(cal.getResults());
  }
}
