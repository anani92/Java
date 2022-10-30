public class Calculator {
	double operand1;
	double operand2;
	String operation;
  double result;
	public void setOperandOne(double operand) {
    this.operand1 = (double) operand;
  }
	public void setOperation(String operation) {
    if (operation == "+") {
    this.operation = "+";
    }
    else if (operation == "-") {
    this.operation = "-";
    }
    else {
      System.out.println("operand not supported");
    }
  }

	public void setOperandTwo(double operand) {
    this.operand1 = (double) operand;
  }


	public void performOperation() {
    if (this.operation == "+") {
      this.result = operand1 +  operand2;
    }
    if (this.operation == "-") {
      this.result = operand1 - operand2;
    }
  }


	public double getResults() {
    return this.result;
	}
}
