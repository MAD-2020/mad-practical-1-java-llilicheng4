import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner scan = new Scanner(System.in);
    //question 5
    System.out.print("Enter number of numbers you would want to enter: ");
    ArrayList<Integer> data = new ArrayList<>();
    int Z = scan.nextInt();

    for(int q = Z; q>0; q--){
      System.out.print("Enter integer: ");
      int add = scan.nextInt();
      data.add(add);

    }
    System.out.println(mode(data));
    scan.close();


  }
      public static int mode(ArrayList<Integer> array) {
        //making the "mode" the first num to use to count
        int mode = array.get(0);
        // set maxcount
        int maxCount = 0;
        //loop to count
        for (int i = 0; i < array.size(); i++) {
            int value = array.get(i);
            int count = 0;
            for (int j = 0; j < array.size(); j++) {
              //if the number matches the value add to count
                if (array.get(j) == value) count++;
                //change maxcount if count is higher
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                    }
                }
        }
        //return the value if there is a mode
        if (maxCount > 1) {
            return mode;
        }
        return 0;
    }
}
    
  }
}
