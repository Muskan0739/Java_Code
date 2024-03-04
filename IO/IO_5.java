import java.io.*;
//BufferedWriter and FileWriter
public class IO_5 {
    public static void main(String[] args) {

        File f=new File("Designs");
        File fp=new File(f,"Design1.txt");

        try{
        FileWriter fw= new FileWriter(fp);
        BufferedWriter bfw=new BufferedWriter(fw);//bufferedWriter need FileWriter to execute it cannot work alone

        bfw.write("Hello");
        bfw.newLine();//goes to next line
        bfw.write(65);//writes th echaracter value of integer
        bfw.write("hey there!");
        bfw.newLine();
        char ch[]= {'m','u','s','k','a','n'};
        bfw.write(ch);

        bfw.close();
        }

        catch(IOException e){
            System.out.println("Exception");
        }
    }
}
