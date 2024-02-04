//package Java_API

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//@Target({ElemntType.TYPE, ElementType.METHOD, ElementType.FIELD})// it can also be written like this 
@Retention(RetentionPolicy.RUNTIME)//defines the scope of annotation
@interface cricketPlayer{
   // String name() default "Virat";
   // int run() default 34;
   /*with this you can give parameters to annotations and with the default keyword you can set the default value of the vatiables*/
}


@cricketPlayer
class Player{
    int run;
    String name;
    //@cricketPlayer-> it throws error because the target of custom annotation is class only and not method or field
    public void setRun(int run){
        this.run=run;    
    }

    public int getRun(){
        return run;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

public class Annotation2 {
    public static void main(String[] args) {
        Player p=new Player();
        p.setRun(66);
        p.setName("Rahul");

        System.out.println(p.getName());
        System.out.println(p.getRun());
    }
}
