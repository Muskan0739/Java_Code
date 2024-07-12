import java.util.*;

public class POEapproach2 {

    public static int power(int a, int b){

        int result=0, mid=0, finalResult;
        

        //Base case condition
        if(b==1){
            
            return a;
           
        }
        //Recursive function call
        else{
            mid=b/2;
            result= power(a,mid);

            //THIS CAN STORE ONLY SMALL INTEGER VALUES IF YOU WANT THE POWER OF 2^32 YOU WILL NOT GET ANY OUTPUT
            //TO FIND 2^32 YOU NEED TO USE BIGINTEGER 
            finalResult=result*result;
                    
            if(b%2!=0){
                return a*finalResult;
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
