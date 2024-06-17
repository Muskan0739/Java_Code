//package 2D Array;

import java.util.*;
import java.io.*;


public class MatrixRotation {

    public void rotatedMatrix(int[][] arr){
        //Step1: Transpose of Matrix
        int m= arr.length;
        int n= arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
    
        //Swap the columns
    
        for(int i=0;i<m;i++){
            int li=0; //left index =0
            int ri=n-1; // right index= n-1
    
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]= arr[i][ri];//swaping the values of clumns
                arr[i][ri]= temp;
    
                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter number of rows in a matrix: ");
        int m= sc.nextInt();
        System.out.println("Enter number of clolumns in a matrix: ");
        int n= sc.nextInt();

        int[][] arr=new int[m][n];

        System.out.println("Enter the elements of matrix");
        for(int i=0;i<m;i++){
            for(int j =0; j<n;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        MatrixRotation mr=new MatrixRotation();
        mr.rotatedMatrix(arr);

        for(var mat: arr){
            System.out.println(Arrays.toString(mat));
        }
    }
    
}
