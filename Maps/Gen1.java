//package Maps;

import java.util.*;

public class Gen1 {
    public static void main(String[] args) {

        //typesafety
        /*String as[]=new String[9];
        as[0]="Muskan";
        as[1]= 3;//Compile time error

       String name=as[0];
       String n2=as[1];*/
        
       //No typesafety
        ArrayList<String> al=new ArrayList<String>();//By using generics you specify the type of data to be store in collection
        al.add("Muskan");
        al.add("Pooja");
        //al.add(32);//Compile Time Error

        System.out.println(al);
        String s=(String)al.get(0);//typecasting
        String s1=(String)al.get(1);
        //String s2=(String)al.get(2);
    
       // System.out.println(s2);//Runtime exception:- ClassCastException, So to avoid this run time exception we use generics<> 

    }
}
