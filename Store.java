import java.io.Console;

public class Store {
  public static void main(String[] args){
    Console console = System.console();
    boolean running = true;
    while(running){
      System.out.println("Would you like to stay or exit?");
      String navResponse = console.readLine();

      if (navResponse.equals("exit")) {
        running = false;
      }
    }
  }
}
