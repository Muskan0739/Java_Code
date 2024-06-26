import java.util.*;

//Time Comlexity= O(n)= By substitution method
//Space Complexity= O(n)- use of Stack Data Structure
public class FactOfNum {

    public static int factNum(int n){

        int result;

        if(n==0 || n==1){ //BASE CASE CONDITION
            result =1;

        }
        else{

            result= n*factNum(n-1); //RECURSIVE CALL
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to find factorial");
        int n=sc.nextInt();

        int result= factNum(n);

        System.out.println("Factorial of the given number is: "+ result);
    }
}
