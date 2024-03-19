import java.io.*;


class Cricket implements Serializable {
    int run;
    transient String name;//if you will use trnsient keyword then in deserialization the value will not be retained

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
      /*Cricket c= new Cricket(23, "Rohit");
        //SERIALIZATION
      FileOutputStream fos=new FileOutputStream("Design.txt");
       BufferedOutputStream bof=new BufferedOutputStream(fos);
       ObjectOutputStream oos= new ObjectOutputStream(bof);//TAKES OBJECT OF FOS

       oos.writeObject(c);//CRUSHES DATA OF OBJECT INTO BINARY FORM 
       oos.flush();
       oos.close();*/

       // DESERIALIZATION

       FileInputStream fis=new FileInputStream("Design.txt");
       BufferedInputStream bis=new BufferedInputStream(fis);
       ObjectInputStream ois=new ObjectInputStream(bis);

       Cricket cr=(Cricket)ois.readObject();
       cr.disp();

       ois.close();
    }
}
