import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("grades.txt");  // this is your problem input as a File object
        Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object

        int sum = 0;
        int count = 0;

        // Write code that reads from the grades.txt file and calculates the average grade
        while (sc.hasNext())  // as long as the Scanner has more lines to read from the file...
        {
            int grade = sc.nextInt();
            sum += grade;
            count++;
        }

        //the loop quits when the scanner has read the entire file
        double average = (double) sum / count;
        System.out.println("The average grade is " + average);


        sc.close();
    }
}
