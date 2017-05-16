import java.io.Console;

public class Ups {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Let's build a cube. Enter the X axis dimension in  inches:");
    String strX = console.readLine();
    int userX = Integer.parseInt(strX);
    System.out.println("Okay thanks, that was "+ userX + ". now how about the Y axis?");
    String strY = console.readLine();
    int userY = Integer.parseInt(strY);


  }
}
