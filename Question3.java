import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
   //create scanner object first
    Scanner scan = new Scanner
    //gets integer 
    System.out.print("Enter integer: ");
    int N = scan.nextInt();
    //close scanner
    scan.close();
    //multiply
    int X = N*N;
    //print
    System.out.println(X);
    
  }
}
