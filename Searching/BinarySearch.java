//package Searching;
import java.util.*;


public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int low=0;
        int high=arr.length -1;
        int index=-1;

        while(low<=high){
            int mid= (low + (high-low))/2;

            if(arr[mid]== target){
                index= mid;
            }
            else if(arr[mid]< target){
                low= mid-1;
            }
            else{
                high=mid+1;
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
        int size=5;

        System.out.println("Enter the sorted elemnts in array:");
        int arr[]=new int[size];

        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int target=sc.nextInt();

        int index=binarySearch(arr, target);

        System.out.println("Taget element is at index:" + index);
    }
}
