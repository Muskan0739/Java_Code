package MultiThreading;

class Car implements Runnable{

    public void run(){
        try{
        System.out.println(Thread.currentThread().getName() + "went to parking area");
        Thread.sleep(2000);
        //SYNCHRONIZING A PARTICULAR BLOCK OF CODE
        synchronized(this){
        System.out.println(Thread.currentThread().getName() + "open car door");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + "Strart driving the car");
        Thread.sleep(2000);
        }
        }

        catch(Exception e){
        System.out.println("error");
        }
    }

}
public class synchronize {
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println(Thread.currentThread().getName());

        Thread t1= new Thread(c);
        Thread t2= new Thread(c);
        Thread t3= new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
