//package 1D Array;
//Time Complexity= O(n)
//Space complexity= O(1)

public class Arr1 {
    public static void main(String[] args) {

        int n=6;
        int arr[]={1,2,4,5,6,7};

        int Sum_Of_Natural_Number= ((n+1)*(n+2))/2;

        int missing_Number=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        missing_Number= Sum_Of_Natural_Number - sum;

        System.out.println("Missing number in the arrray is: "+ missing_Number);
}
}
