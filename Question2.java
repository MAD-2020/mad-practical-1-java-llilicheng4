import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    //second question:
    //prompt user for height and weight
    //create scanner object first
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Height(Metres): ");
    double height = scan.nextDouble();
    System.out.print("Enter Weight(KG): ");
    double weight =  scan.nextDouble();
    //close scanner
    
    //calculate bmi
    double bmi = weight/(height*height);
    // print bmi to 2 decimal places
    System.out.printf("Your bmi is %.2f%n",bmi);
  }
}
