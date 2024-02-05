//package IO;

//CREATING FILE AND DIRECTORY USING FILE CLASS

import java.io.*;
public class IO_1 {
    public static void main(String[] args) throws IOException
     {
        File f1= new File("Design.txt");//File constructor takes arguement

        System.out.println(f1.exists());/*FALSE- because Design.txt file doesn't exists in physical and with File() constructor you can't create a new file either f1 will point to the existing file or it will point to java file object(incase the file does not exist)*/

        f1.createNewFile();
        System.out.println(f1.exists());//TRUE- new file named Design.txt is created

        //MAKING DIRECTORY
        File dir= new File("Designs");
        dir.mkdir();
        System.out.println(dir.exists());

        //MAKING FILE INSIDE A DIRECTORY
        File fp=new File(dir, "Design1.txt");
        fp.createNewFile();
        System.out.println(fp.isFile());

        String fileNames[]= dir.list();//list() stores all the files name inside the directory in a string array
        int count=0;

        for(String name: fileNames){
            count++;
            System.out.println(name);
        }
        System.out.println("Total no. of files in the Design directory is: " +count);

    }
}
