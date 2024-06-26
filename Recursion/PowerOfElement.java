import java.util.*;



public class PowerOfElement {

    public static int powerOfNumber(int a, int b){
        int result;

            //BASE CASE CONSITION
        if(b==1){
            result=a;
        }
        else{
            result= a*powerOfNumber(a, b-1); //Recursive Function
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a, b;
        System.out.println("Enter the element and the power number:");
        a=sc.nextInt();
        b=sc.nextInt();

        int result=powerOfNumber(a,b);

        System.out.println("The result is:" + result);
    }
}
