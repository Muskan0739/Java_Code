//package Java_API;

enum Result
{
    PASS,FAIL, NR;
    int marks;

    public void Result(){
        System.out.println("Constructor in enum");
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    public int getMarks(){
        return marks;
    }

}
public class enum2 {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int m1=Result.PASS.getMarks();
        System.out.println(m1);

        int m2=Result.FAIL.getMarks();
        System.out.println(m2);

        Result.NR.setMarks(34);
        int m3= Result.NR.getMarks();
        System.out.println(m3);

    }
}
