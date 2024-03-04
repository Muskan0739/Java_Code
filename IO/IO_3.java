//package IO;

import java.io.*;
public class IO_3 {
    public static void main(String[] args) {
        File fp=new File("Designs");
        File file=new File(fp, "Design2.txt");

        System.out.println(file.isFile());

        try{
        FileReader fr=new FileReader(file);

        int i=fr.read();
        System.out.println((char)i);//Typecasting int to char

        while(i!=-1){
            System.out.print(i+ "----> ");
            System.out.println((char)i);
            i= fr.read();//Reading every character of file one by one can be a lengthy task so instead use an character array to store all the information in the array and traverse it one by one// REFER TO NEXT CODE IO_4
        }
        }

        catch(IOException e){
            System.out.println("You got an error");
        }

        


    }
}
