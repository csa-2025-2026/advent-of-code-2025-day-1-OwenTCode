import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("input.txt");  // this is your problem input as a File object
    Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object
    int turnAmount;
    String turnAmountNotInt;
    String turnDirection; 
    int password = 0; 
    int start = 50; 


    int answer = 0;
    while (sc.hasNext())  // as long as the Scanner has more lines to read from the file...
    {
      String line = sc.nextLine();  // gets the next line of input.  This is like "R802"

      // TODO: Write code that gets the turning direction from the line.  This should be "L" or "R"
      turnDirection = line.substring(0,1);


      // TODO: Write code that gets a substring of the line that contains only the numbers
      turnAmountNotInt = line.substring(1);

      // For R802, this would be a String variable with the value "802"


      // TODO: Using the parseInt method from the Integer class, convert the String "802" into an int
      turnAmount = Integer.parseInt(turnAmountNotInt);

      // TODO: Now that you have the turning direction, and the turning amount, see if the turn results in a 0

      if (turnDirection == "R")
      {
        start = start + turnAmount;
        if (start + turnAmount >= 100)
        {
            start = start%100;
        }

        if (start == 0)
        {
          password++;
        }
        
      }

      if (turnDirection == "L")
      {
        start = start - turnAmount;
        if ((start - turnAmount) == 0)
        {
          password++;
        }
        else if (start - turnAmount < 0)
        {
          start += 100; 
        }

        if (start == 0)
        {
          password++;
        }

      }


    }

    System.out.println("The password is " + answer);
    sc.close();
  }
}
