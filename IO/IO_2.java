//package IO;
//WRITING DATA IN A FILE USING FILE WRITTER
import java.io.*;
public class IO_2 {
    public static void main(String[] args) {

        File f1= new File("Designs");
       // System.out.println(f1.isDirectory());

        File f2= new File(f1, "Design2.txt");
        //f2.createNewFile();
        try{
        FileWriter fw= new FileWriter(f2, true); /*Setting this as true so that new data can be appended in to the file. By default it is false which means every time you make changes in data it will over write on th eold data.*/
        fw.write("Heyoo ");
        fw.write("There! \n");
        fw.write("How are you? \n");
        fw.write("What's your name? \n");
        fw.write("How may I help you?\n");
        
        fw.close();//It is important to close the resource after done writing into the file!! If not done the data won't we written in file
        }
        catch(IOException e){
            System.out.println("You got an error: "+ e);
        }

        System.out.println("open Design2.txt file to see the result :)");


    }
}
