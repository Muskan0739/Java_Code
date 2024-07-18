public class SumofNat {
    public static int Sum(int n){
        int sum=0;
        if(n==1){
           return 1;
        
        }
        else{
            sum= n+ Sum(n-1);
            
        }
       return sum;
    }
    public static void main(String[] args) {
        int n=5;

        int result=Sum(n);
        System.out.println("result is"+ result);
    }
}
