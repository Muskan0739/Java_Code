//TIME COMPLAXITY= O(log n)
//space complexity= O(1)

import java.util.*;

public class lowerBoundIndexProb {
//FUNCTION TO FIND THE FIRST OCCURENCE OF THE ELEMENT IN THE ARRAY
    public static int firstOccurence(int arr[], int target){
        int low=0;
        int high= arr.length-1;
        int index=-1;

        while(low<=high){
            int mid=low +(high-low)/2;//USING THIS FROMULA TO AVOID THE VERFLOW CONDITION 

            if(arr[mid] == target){
                index=mid;
                high=mid-1;//USING THIS TO SEARCH THE SAME ELEMENT AT LEFT HAND SIDE OF THE ARRAY
            }
            else if(arr[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(index!=-1){
            return index;
        }
        else{
            return -1;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={2,4,5,5,5,7};
        int target=5;

        int index=firstOccurence(arr, target);

        System.out.println("Target element is at index:"+ index);
        
    }
}
