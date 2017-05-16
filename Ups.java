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
      System.out.println("Okay, fun fact: The volume of that parcel is " + userVolume + "!");
      System.out.println(cube.xAxis);
    }



  }
}
