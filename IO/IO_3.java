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
            i= fr.read();
        }
        }

        catch(IOException e){
            System.out.println("You got an error");
        }

        


    }
}
