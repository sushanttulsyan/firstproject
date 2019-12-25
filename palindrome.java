class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
    } 
} 
  
// Main Class 
public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        long num = 1;
        for (int i=0; i<8; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    } 
