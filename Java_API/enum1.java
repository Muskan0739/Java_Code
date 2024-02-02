//package Java_API;

enum Weak
{
    MON, TUE, WED,THUR,FRI,SAT,SUN;

}
public class enum1 {
    public static void main(String[] args) {
        Weak w1= Weak.MON;
        System.out.println(w1);

        int num=Weak.MON.ordinal();//return the index of the values in enum Weak
        System.out.println(num);

        Weak w2[]=Weak.values();//returns array fo the values of enum Weak

        for(Weak i:w2){
            System.out.println(i + ": " + i.ordinal());
        }
    }
}
