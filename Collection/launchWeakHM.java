//HASHMAP VS WEAKHASHMAP

import java.util.*;

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return name +" "+ age;
    }
    @Override
    public void finalize(){
        System.out.println("clean up work by GC before de allocating memory from heap area");
    }

}
public class launchWeakHM {
    public static void main(String[] args) {
        Employee em=new Employee("Muskan", 19);

       /*HashMap hm= new HashMap();

        hm.put(1, em);
        System.out.println(hm);//As hashMap dominates over garbage collector so finalize method is not used, so now we will use weakhashMap

        em=null;// Ready for garbage collection in heap area
        System.gc();//envoking garbage collector
        System.out.println(hm);*/

        WeakHashMap whm=new WeakHashMap();
        whm.put(1, em);
        System.out.println(whm);

        em=null;//eligible for garbage collection
        System.gc();

        System.out.println(whm);

        System.out.println("Line ends here");
    }
}