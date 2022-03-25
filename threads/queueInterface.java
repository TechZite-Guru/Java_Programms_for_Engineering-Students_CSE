import java.util.*;
 
public class Main {
    
    static class Queue {
        static Stack<Integer> stack1 = new Stack<Integer>();
        static Stack<Integer> stack2 = new Stack<Integer>();
        
        static void enQueue(int x) {
            stack1.push(x);
        }
        
        static void deQueue(int x) {
            stack2.push(stack1.pop(x));
        }
        
    }
 
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
 
        Queue q = new Queue();
        
        for(int i = 1; i<=6; i++ ) {
            System.out.println("Enter "+i+" Integer to add: ");
            int k = s.nextInt();
            q.enQueue(k);
        }
        
        System.out.println("Initial Queue: " + stack1);
        
        for(int i = 1; i<=2; i++ ) {
            System.out.println("Enter Integer to remove: ");
            int k = s.nextInt();
            q.deQueue(k);
        }
        
        System.out.println("Removed Elements: " + stack2);
        System.out.println("Existing Elements: " + stack1);
    }
}
