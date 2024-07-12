import java.util.*;

//program to print the multiple of the number to the given k

public class MultipleOfNum {
    public static void printMulti(int n, int k){
        //Base case condition
        if(k==1){
            System.out.println(n);
            return; //returning because if not infinite loop will start
        }
//Recursive code
        printMulti(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number and k");
        int n=sc.nextInt();
        int k=sc.nextInt();

        printMulti(n,k);
    }
}
