import java.util.Scanner;

public class SumOfTwo {

    static void m1(int a,int b){
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        m1(2,4);
        System.out.println("enter a num");
        Scanner a=new Scanner(System.in);
        int AB=a.nextInt();
        int ab=a.nextInt();
        m1(ab,AB);


    }
}
