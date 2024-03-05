import java.io.*;


class Cricket implements Serializable {
    int run;
    transient String name;

    public Cricket(int run, String name){
        this.run=run;
        this.name=name;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(run);
    }
}

public class IO_8 {
    public static void main(String[] args) throws Exception{
      Cricket c= new Cricket(23, "Rohit");
        //SERIALIZATION
      /*FileOutputStream fos=new FileOutputStream("Design.txt");//wORKS AS A PIPE TO STORE DATA IN THE FILE
       BufferedOutputStream bof=new BufferedOutputStream(fos);
       ObjectOutputStream oos= new ObjectOutputStream(bof);//TAKES OBJECT OF FOS

       oos.writeObject(c);//CRUSHES DATA OF OBJECT INTO BINARY FORM df
       oos.flush();
       oos.close();*/

       // DESERIALIZATION

       FileInputStream fis=new FileInputStream("Design.txt");
    //   BufferedInputStream bis=new BufferedInputStream(fis);
       ObjectInputStream ois=new ObjectInputStream(fis);

       Cricket cr=(Cricket)ois.readObject();
       cr.disp();

       ois.close();
    }
}
