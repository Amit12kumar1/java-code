import java.util.Scanner;

public class Squre {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner a = new Scanner(System.in);
        int mark = a.nextInt();
        System.out.println("enter weight");
        Scanner b = new Scanner(System.in);
        int mark2 = b.nextInt();
        if (mark == mark2) {
            System.out.println("rectangle");
        } else {
            System.out.println("not rectangle");
        }
        Vahicle a1=new Vahicle();
        System.out.println(a1.model);
    }
}
