import java.util.*;

public class Assignment{
    public static boolean findElem(int arr[][], int target){
        int n=arr[0].length;
        int m= arr.length;
        int low=0;
        int high= m*n-1;
        int midElem, midInd;
    
        while(low<high){
            midInd=low+ (high-low)/2;
            midElem= arr[midInd/n][midInd%n];

            if(midElem==target){
                return true;
            }
            else if(midElem<target){
                low= midInd+1;
            }
            else{
                high=midInd-1;          
              }
              
        }
        return false;

    }

   public static void main(String[] args) {
    int arr[][]={{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
    int target= 12;
    boolean result= findElem(arr, target);
    System.out.println(result);

   }
}