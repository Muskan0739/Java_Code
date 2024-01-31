import java.util.*;

public class launchTS {
    
    public static void main(String[] args){
        TreeSet ts=new TreeSet();

        ts.add(100);
        ts.add(343);
        ts.add(33);
        ts.add(50);

        System.out.println(ts);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println(ts.ceiling(80));
        System.out.println(ts.floor(50));

    }
}
