//package Java_API;

import java.util.Date;

public class Date_Time{
    public static void main(String args[]){

        //version 1.7 Date and Time API
        Date d=new Date();
        System.out.println(d);

        /*java.util.Date dt= new Date();
        System.out.println(dt);*/  //Both the ways produce same output
        //Java Date and time API in version 8:- Joda_Time API
       
        long timeInMs=d.getTime();//getTime function gives time in milisecond
        System.out.println(timeInMs);

        java.sql.Date dt=new java.sql.Date(timeInMs);//this constuctor takes long datatype as parameter
        System.out.println(dt);
    }

}