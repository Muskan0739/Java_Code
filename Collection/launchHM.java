import java.util.*;
import java.util.Map.*; //it contains all the methods of Map


class Student{
    private int age;
    private String name;
    private String city;

    public Student(String name, int age, String city){
        this.name=name;
        this.age= age;
        this.city=city;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCity(){
        return city;
    }

    public String toString(){ //toString method is a method of object class and we have to override it here because the map gives the hashcode as output and we want the correct output
        return name + " "+ age +" " + city;
    }

}

public class launchHM {
    public static void main(String args[]){

        Student st1=new Student("Muskan", 19, "Satna");
        Student st2=new Student("Khushi", 21, "Satna");
        Student st3=new Student("Rajnish", 22, "Satna");

        Map m=new HashMap();

        m.put(1, st1);
        m.put(2, st2);
        m.put(3, st3);

        System.out.println(m);

        Set set=m.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
           // System.out.println(itr.next());
           Map.Entry data=(Entry)itr.next();//accesing data and storing in a variable to use later in program
           System.out.println(data.getKey()+ ":" + data.getValue());
        }

    }
}
