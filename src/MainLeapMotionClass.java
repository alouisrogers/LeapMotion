import com.leapmotion.leap.*;
import java.io.IOException;

public class MainLeapMotionClass {

  public static void main(String[] args) {
    System.out.println("Press Enter to quit...");
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
