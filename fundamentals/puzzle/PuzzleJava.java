import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava{
  public ArrayList<Integer> getTenRolls() {
    Random randMachine = new Random();
    int upperBond = 20;
    ArrayList<Integer> rolls = new ArrayList<Integer>();
    for (int i=0; i<upperBond; i++) {
      rolls.add(randMachine.nextInt(upperBond)+1);
    }
    return rolls;
  }
  public char getRandomLetter() {
    int charAmount = 'z' - 'a' + 1;
    char[] alpha = new char[charAmount];
    for(int i = 0; i < charAmount ; i++){
        alpha[i] = (char)('a' + i);
    }
    Random randIdx = new Random();
    int letterIdx = randIdx.nextInt(25);
    return alpha[letterIdx];
  }
  public String generatePassword() {
    String password = "";
    int passwordLength = 8;
    for (int i=0; i < passwordLength; i++) {
      password += this.getRandomLetter();
    }
    return password;
  }
  public ArrayList<Object> shuffleArray(ArrayList<Object> list){
    Random rand = new Random();
    int idx = rand.nextInt(list.size());
    Object temp;
    for (int i=0; i< idx; i++) {
      temp = list.get(i);
      list.set(i, list.get(idx));
      list.set(idx, temp);
    }
    return list;
  }
}