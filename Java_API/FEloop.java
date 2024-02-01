//
import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;
public class FEloop {
    public static void main(String[] args) {
        /*List<Integer> l1=new ArrayList<Integer>();
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(3);
        System.out.println(l1);*/

        List<Integer> l2=Arrays.asList(2,3, 5,3);
        System.out.println(l2);

        //To access all the elments of our collection we will use for each loop
         /*for(Integer i: l2){
            System.out.println(i);
        }*/ //OR

       /*Consumer<Integer> c= new Consumer<Integer>() { //Anonymous Inner class 
            @Override
           public void accept(Integer i)
           { System.out.println(i);}
        };*/
//OR
        //Consumer<Integer> c= i-> System.out.println(i);

        l2.forEach(i -> System.out.println(i));
        
        /*For each method has consumer functional interface which has accept method. This method uses functional inetrface to access the data and print that. Or you can explicitly use consumer interface and override accept method*/
    }
}
