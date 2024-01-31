//Interrupt() example

package MultiThreading;

class Example implements Runnable{
    public void run(){

        try{
            for(int i=1; i<6; i++){
            System.out.println("Work lil more hard :)");
          Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("thread is interrupted");
        }
    
        
    }
}

public class multi1  
{
    public static void main(String args[]) //throws Exception
    {
        System.out.println("Main thread starts");

        Example e= new Example();

        Thread t=new Thread(e);

        t.start();
        t.interrupt();
        //t.join();
        System.out.println("Main thread ends");

    }
}
