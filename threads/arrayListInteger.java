import java.io.*;
import java.util.*;
 
class arrayListIntegers {
   
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter No.of Integers to Store: ");
        int n = s.nextInt();
     
        // create ArrayList list1
        ArrayList<Integer> list = new ArrayList<>();
 
        // Add elements using add method
        for (int i = 1; i<= n; i++) {
            System.out.println("Enter "+i+" Integer to Store: ");
            int m = s.nextInt();
            list.add(m);
        }
      
        System.out.println("Resultant Hashset: " +list);
    }
}
