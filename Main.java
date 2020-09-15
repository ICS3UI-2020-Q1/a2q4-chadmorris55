import java.util.Scanner;
/**
 * This program eill tell the user how much money the customer will save based on how much they spend
 * @Chad Morris
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);

    //price brackets
    final double tenLow = 0.01;
    final double tenHigh = 40.00;
    final double twentyLow = 40.01;
    final double twentyHigh = 80.00;
    final double thirtyLow = 80.01;
    final double thirtyHigh = 120.00;
    final double fortyLow = 120.01;
    final double divisor = 100;
    final double tenOff =  10;
    final double twentyOff = 20;
    final double thirtyOff = 30;
    final double fortyOff = 40;

    //finds out how much money was spent and records it
    System.out.println("Please enter the amount the customer spent");
    double price = input.nextDouble();

    //determines how much percent they will get off
    if (price > tenLow && price < tenHigh){
      double saved = price / divisor * tenOff;
      double newTotal = price - saved;
      System.out.println("They will receive 10% off.");
      System.out.println("They will save " + saved + ".");
      System.out.println("The new total is " + newTotal + ".");
  } else if (price > twentyLow && price < twentyHigh){
      double saved = price / divisor * twentyOff;
      double newTotal = price - saved;
      System.out.println("They will receive 20% off.");
      System.out.println("They will save " + saved + ".");
      System.out.println("The new total is " + newTotal + ".");
  } else if (price > thirtyLow && price < thirtyHigh){
      double saved = price / divisor * thirtyOff;
      double newTotal = price - saved;
      System.out.println("They will receive 30% off.");
      System.out.println("They will save " + saved + ".");
      System.out.println("The new total is " + newTotal + ".");
  } else if (price > fortyLow){
    double saved = price / divisor * fortyOff;
      double newTotal = price - saved;
      System.out.println("They will receive 40% off.");
      System.out.println("They will save " + saved + ".");
      System.out.println("The new total is " + newTotal + ".");
  }
  }
}
