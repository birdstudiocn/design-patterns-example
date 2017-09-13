import java.io.*;

public class OrderLog {

  public void log (Order order) {
    PrintWriter dataOut = null;
    try {
      dataOut =
        new PrintWriter (new FileWriter("order.txt"));
      String dataLine =
        order.getID() + "," + order.getItem() +
        "," + order.getQty();

      dataOut.println(dataLine);
      dataOut.close();
    } catch (IOException e) {
      System.err.println("IOException Occurred: " +
                         e.getMessage());
    }
  }
}

