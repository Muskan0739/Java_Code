//package Java_API;
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.function.Predicate;


public class Stream_API_2 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,7,4,1);

        Stream<Integer> stream=list.stream();

        /*long count=stream.count();//count method doesnot return a new stream
        System.out.println(count);*/ 

        Predicate<Integer> pre= i-> i%2==1;
        Stream<Integer> filterStream=stream.filter(pre);/*filter() is used to filter the dat of stream and implements a predicate functional interface*/

        Stream<Integer> sortedStream=filterStream.sorted();//sorts the data of stream

        Stream<Integer> finalStream=sortedStream.map(i-> i*2);//map() produces a new stream and implements a functional interface


//OR  you can perform all the above operations like this

       /*Stream<Integer> finalStream=stream.filter(i-> i%2==1).sorted().map(n-> n*2);*/
        finalStream.forEach(i-> System.out.println(i));
    }
}
