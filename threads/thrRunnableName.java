public class MyThread implements Runnable {
    
    public void run() {    
        System.out.println("I am Thread");    
    }    
    
    // main method  
    public static void main(String argvs[]) {   
        // creating an object of the class MyThread2
        Runnable r = new MyThread();
  
        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread x = new Thread(r, "Thread Name");
  
        // start thread using start()
        x.start();
  
        // getting the thread name using getName()
        String str = x.getName();
        System.out.println(str);
    }
}
