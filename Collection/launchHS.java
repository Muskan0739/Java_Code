import java.util.*;

public class launchHS {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
//it stores data uniquely/randomly in hash bucket
        hs.add(34);
        hs.add(45);
        hs.add(343);
        hs.add(67);
        System.out.println(hs);

        LinkedHashSet lhs=new LinkedHashSet();
// it retains the order of data stored in the output as well
         lhs.add(34);
         lhs.add(45);

         System.out.println(lhs);

    }
}