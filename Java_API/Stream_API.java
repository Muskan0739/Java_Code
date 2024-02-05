
import java.util.*;
import java.util.stream.*;


public class Stream_API {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2, 3, 4, 77);

        Stream<Integer> listStream=list.stream(); //making a separate stream of data of collection ArrayList

        listStream.forEach(i-> System.out.println(i*2));

      //  listStream.forEach(i-> System.out.println(i*2));   /*It will generate Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed, because a stream can be operated only once*/
    }
}
