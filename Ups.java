import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class Ups {
  public static void main(String[] args) {
    Console console = System.console();
    List<Parcel> cubert = new ArrayList<Parcel>();

    System.out.println("Let's build a cube. Enter the X axis dimension in  inches:");
    String strX = console.readLine();
    int userX = Integer.parseInt(strX);
    System.out.println("Okay thanks, that was "+ userX + ". now how about the Y axis?");
    String strY = console.readLine();
    int userY = Integer.parseInt(strY);
    System.out.println("Right on, that was " + userY + ". now let's get the Z axis?");
    String strZ = console.readLine();
    int userZ = Integer.parseInt(strZ);
    System.out.println("And " + userZ + ". Thanks!");

    Parcel userParcel = new Parcel(userX, userY, userZ);
    cubert.add(userParcel);

    for (Parcel cube : cubert){
      int userVolume = cube.parcelVolume(cube.xAxis, cube.yAxis, cube.zAxis);
      System.out.println();
      System.out.println("Parcel volume is " + userVolume + ".");
      if (userVolume < 30) {
        System.out.println("This size is considered STANDARD. No additional cost.");
      } else {
        System.out.println("This ize is considered LARGE. $2 additional charge");
        userParcel.price = userParcel.price + 2;
      }
    }

    System.out.println("Now, what is the weight of your parcel in pounds?");
    String strWeight = console.readLine();
    int userWeight = Integer.parseInt(strWeight);
    System.out.println(userWeight);

    userParcel.weight = userWeight;
    userParcel.sort =  userParcel.sorted(userWeight);

    if (userParcel.sort == 0) {
      System.out.println("This package is considered STANDARD size. No additional cost.");
    } else if (userParcel.sort == 1){
      System.out.println("This item is considered HEAVY. $2 additional charge");
      userParcel.price = userParcel.price + 2;
    }

    System.out.println("How far are you shipping the parcel in miles?");
    String strDistance = console.readLine();
    int userDistance = Integer.parseInt(strDistance);
    userParcel.distance = userDistance;

    if (userParcel.distance < 1000){
      System.out.println("Standard distance rates apply of $5");
      userParcel.price = userParcel.price + 5;
    } else {
      System.out.println("Long distance charges apply to deliveries over 1000 miles. Additional charge of $10");
      userParcel.price = userParcel.price + 10;
    }


    System.out.println("$" + userParcel.price);



  }
}
