import java.util.*;

//BECAUSE JAVA.MATH PACKAGE HAS BIGINTEGER CLASS so to use biginteger we need to import java.math package
import java.math.*;


public class POEapproach3 {

    public static BigInteger powerOfBigNum(BigInteger a, int b){
        BigInteger result, finalResult;

        //base case condition
        if(b==1){
            return a;
        }
        //recursive code
        else{
            result=powerOfBigNum(a, b/2);

            //TO MULTIPLY IN BIGINTEGER WE USE MULTIPLY() METHOD
            finalResult=result.multiply(result);

            if(b%2==0){
                return finalResult;
            }
            else{
                return a.multiply(finalResult);
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number and the power of the number: ");

        //WE ARE TAKING 'a' AS BIGINTEGER BECAUSE THE FUNCTION RETURNS BIGINTEER VALUE 
        //IF WILL TAKE 'a' AS INTEGR THE CODE WILL SHOW ERROR
        BigInteger a= sc.nextBigInteger();
        int b=sc.nextInt();

        BigInteger result= powerOfBigNum(a,b);

        System.out.println("The power of the number is: "+result);
    }
}
