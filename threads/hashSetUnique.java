import java.io.*;
import java.util.*;
 
class hashSetUnique {
   
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter No.of Integers to Store: ");
        int n = s.nextInt();
        // Instantiate an object of HashSet
        HashSet<Integer> set = new HashSet<Integer>();
 
        // Add elements using add method
        for (int i = 1; i<= n; i++) {
            System.out.println("Enter "+i+" Integer to Store: ");
            int m = s.nextInt();
            set.add(m);
        }
      
        System.out.println("Resultant Hashset: " +set);
    }
}
