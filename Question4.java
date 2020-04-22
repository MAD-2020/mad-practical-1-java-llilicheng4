import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
     //create scanner object first
    Scanner scan = new Scanner
    //get integer
    System.out.print("Enter integer: ");
    int i = scan.nextInt();
    for(int k = i; k>0 ;k--)
    {
      for(int j = k; j>0; j--)
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
    scan.close();
  }
}
