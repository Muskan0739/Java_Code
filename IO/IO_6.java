import java.io.*;


public class IO_6 {
    public static void main(String[] args) {
        File fp=new File("Designs");
        File file=new File(fp, "Design1.txt");

        try{
        FileReader fr=new FileReader(file);
        BufferedReader br= new BufferedReader(fr);

        String str= br.readLine();//reads a whole line

        while(str!= null){
            System.out.println(str);
            str =br.readLine();
        }
        br.close();
        }
        catch(IOException e){
            System.out.println("exception occured");
        }
        
    }
}
