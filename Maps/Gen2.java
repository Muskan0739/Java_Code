//package Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Gen{

}
public class Gen2 {
    public static void main(String[] args) {

        Gen g=new Gen();

        //VALID
        ArrayList<String> l1=new ArrayList<String>();
        List<Integer> l2=new ArrayList<Integer>();
        Collection<String> l3=new ArrayList<String>();
        List<Gen> l7=new ArrayList<Gen>();

        //INVALID
        /*ArrayList<Object> l4=new ArrayList<Integer>();
        ArrayList<int> l5=new ArrayList<int>();*///primitive datattypes cant be added


    }
}
