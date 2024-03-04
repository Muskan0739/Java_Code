import java.io.*;

public class IO_4 {
    public static void main(String[] args) {
        File f=new File("Designs");
        File fp=new File(f, "Design2.txt");

        try{
        FileReader fd= new FileReader(fp);

        //making a character array of the length of characters stored in the file
        char ch[]= new char[(int)fp.length()];//explicit typecasting into int
        fd.read(ch);//read every character from the file and store in the char ch[] array

        for(char name:ch){
            System.out.print(name);
        }
        fd.close();
        }
        catch(IOException e){
            System.out.println("Thriws exception");
        }
        

    }
}
