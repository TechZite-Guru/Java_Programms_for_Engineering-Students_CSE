import java.util.*;
 
public class queueInterface {
 
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue2 = new PriorityQueue<>();
 
        for(int i = 1; i<=6; i++ ) {
            System.out.println("Enter "+i+" Integer to add: ");
            int k = s.nextInt();
            queue.add(k);
        }
        
        System.out.println("Initial Queue: " + queue);
        
        for(int i = 1; i<=2; i++ ) {
            System.out.println("Enter Integer to remove: ");
            int k = s.nextInt();
            queue.remove(k);
            queue2.add(k);
        }
        System.out.println("Removed Elements: " + queue2);
        System.out.println("Existing Elements: " + queue);
    }
}
