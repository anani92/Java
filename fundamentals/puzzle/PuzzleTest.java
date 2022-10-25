import java.util.Arrays;
import java.util.ArrayList;
public class PuzzleTest {
  public static void main (String[] args) {
    PuzzleJava puzzle = new PuzzleJava();
    ArrayList <Object> myArr  = new ArrayList <Object>();
    myArr.add('h');
    myArr.add("hello");
    myArr.add(2);
    myArr.add(5);
    myArr.add(22);
    myArr.add(3);

    System.out.println(puzzle.getTenRolls());
    System.out.println(puzzle.getRandomLetter());
    System.out.println(puzzle.generatePassword());
    System.out.println(puzzle.shuffleArray(myArr));
  }
}