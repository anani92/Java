import java.util.ArrayList;
public class Calculator {
  ArrayList <Double> nums;
  ArrayList <String> operators;
  public double result;

  public Calculator(){
    this.nums = new ArrayList<Double>();
    this.operators = new ArrayList<String>();
  }
  public void performOperations(double num) {
    nums.add(num);
  }
  public void performOperations(int num){
    nums.add((double) num);
  }
  public void performOperations(String str){
    if (str != "="){
        operators.add(str);
    }

    else {
      Double start = nums.get(nums.size()-1);
      for (int i = operators.size()-1; i >= 0; i--) {
        switch (operators.get(i)) {
          case "+":
            start = start + nums.get(i);
            break;
          case "-":
            start = start - nums.get(i);
            break;
          case "*":
            start = start * nums.get(i);
            break;
          case "/":
            start = start / nums.get(i);
            break;
          default:
            System.out.println("Invalid operator");
            break;
        }
      this.result = start;
      }
    }
  }
  public double getResults() {
    return this.result;
	}

}