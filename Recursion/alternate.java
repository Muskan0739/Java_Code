import java.util.*;


public class alternate{

    public static int alternateSign(int n){
        int sum;

        if(n==1){
            return 1;

        }
        else{
            if(n%2==0){
                sum= alternateSign(n-1)+n;
            }
            else{
                sum= alternateSign(n-1)-n;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        int sum=alternateSign(n);

        System.out.println(sum);
    }
}