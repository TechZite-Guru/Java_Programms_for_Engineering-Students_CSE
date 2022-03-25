import java.io.*;
import java.util.*;
 
class arrayListIntegers {
   
    public static void main(String[] args)
    {
        // create ArrayList list1
        ArrayList<Integer> list = new ArrayList<>();
 
        // Add elements using add method
        for (int i = 1; i<=100; i++) {
            list.add(i);
        }
      
        System.out.println(list.size());
    }
}
