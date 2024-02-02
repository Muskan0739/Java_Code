//package Java_API;

enum Result1
{
    PASS,FAIL,NR;

}
public class enum3 {
    public static void main(String[] args) {
        Result res= Result.FAIL;

        switch(res){
            case PASS:System.out.println("pass");
            break;
            case FAIL: System.out.println("fail");
            break;
            default: System.out.println("No result found");
            break;
        }
    }
}
