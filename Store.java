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
      System.out.println("Would you like to search by 'year' 'price' 'all' or 'exit'?");
      String navResponse = console.readLine();

      if (navResponse.equals("all")){
        for (Product item : inStock){
          System.out.println(item.artistName);
        }
      } else if (navResponse.equals("year")){
        System.out.println("Pick a year and we'll show you all albums from that year and newer");
        String strNum2 = console.readLine();
        int userYear = Integer.parseInt(strNum2);
        System.out.println("You said " + userYear);

        for (Product item : inStock){
          if (item.byYear(userYear)) {
            System.out.println(item.albumName + " was released in " + item.releaseYear);
            System.out.println();
          }
        }

      } else if (navResponse.equals("price")){
        System.out.println("How much can you afford to spend?");
        String strNum = console.readLine();
        int userPurse = Integer.parseInt(strNum);
        System.out.println("You said $" + userPurse + ". The following items are available in that price range:");
        System.out.println();

        for (Product item :inStock){
          if (item.canAfford(userPurse)){
            System.out.println(item.artistName + "'s album " + item.albumName + " for $" + item.albumPrice);
            System.out.println();
          }
        }

      } else if (navResponse.equals("exit")) {
        running = false;
      }
    }
  }
}
