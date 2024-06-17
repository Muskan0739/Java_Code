//package Searching;
//Time Complexity= O(n)
//Space COmplexity= O(1)

import java.util.*;


public class LinearSearch {

    public static int linearSearch(int arr[], int target){
        int index= -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                index=i;
            }
        }
       if(index!= -1 ){
        return index;
    }
    else{
        return -1;
    }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=5;

    System.out.println("Enter the elements in the array");
    int arr[]= new int[size];
        
            for(int i=0; i<arr.length;i++){
                arr[i]= sc.nextInt();
            }

    System.out.println("Enter  the target element:");
    int target= sc.nextInt();

    int index=linearSearch(arr, target);

    System.out.println("Target element is at index "+ index);
}
}