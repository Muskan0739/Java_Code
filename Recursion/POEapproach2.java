import java.util.*;

public class POEapproach2 {

    public static int power(int a, int b){

        int result=0, mid=0;
        int finalResult=0;

        //Base case condition
        if(b==1){
            
            return a;
           
        }
        //Recursive function call
        else{
            mid=b/2;
            result= power(a,mid);
            finalResult= result*result;

            //Upgrading to new type
            long Result=finalResult;

            if(b%2!=0){
                Result=finalResult*a;
                return (int)Result;
            }
            else{
                return finalResult;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   

        int a,b;
        System.out.println("Enter the number and the power number:");
        a=sc.nextInt();
        b=sc.nextInt();

        int result= power(a,b);
        System.out.println("The result is:" + result);
    
    }
}
