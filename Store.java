import java.io.Console;

public class Store {
  public static void main(String[] args){
    Console console = System.console();
    boolean running = true;

    Product pop1 = new Product("Raz Al Ghoul","The Wreckening", 2009, 12);
    Product pop2 = new Product("Britney Polearm","Stab me Baby One More Time", 2013, 18);
    Product rap1 = new Product("Young Clean Heir", "All About That GPA", 2011, 14);
    Product rap2 = new Product("Phone, Hugs, and eHarmony", "Get Atcha Girl", 2015, 20);

    Product[] inStock = {pop1,pop2,rap1,rap2};

    while(running){
      System.out.println("Would you like to 'browse' 'price' match or 'exit'?");
      String navResponse = console.readLine();

      if (navResponse.equals("browse")){
        for (Product item : inStock){
          System.out.println(item.artistName);
        }
      } else if (navResponse.equals("price")){
        System.out.println("How much can you afford to spend?");
        String strNum = console.readLine();
        int userPurse = Integer.parseInt(strNum);

        for (Product item :inStock){
          if (item.canAfford(userPurse)){
            System.out.println(item.artistName);
            System.out.println(item.albumPrice);
          }
        }

      } else if (navResponse.equals("exit")) {
        running = false;
      }
    }
  }
}
