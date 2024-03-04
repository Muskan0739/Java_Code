import java.io.*;
//USE OF PRINTWRITER
public class IO_7 {
    public static void main(String[] args) throws Exception{
        File fp=new File("designs");
        File file=new File(fp,"Design3.txt");
        file.createNewFile();

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.write(97);//with write method you cant store integer value directly in file it will store the corresponding character value
        pw.write("\n");

        pw.println("Java");//with print or println method yoou can store integer, float, boolean, or character value directly in file
        pw.print(100 );
        pw.println(50.5);
        pw.println(true);
        pw.print("Bye");

        pw.close();
    }
}
