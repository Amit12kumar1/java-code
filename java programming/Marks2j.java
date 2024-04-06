import java.util.Scanner;
public class Marks2j{
    public static void main(String[] args) {
        System.out.println("enter a marks");
        Scanner marks=new Scanner(System.in);
        int mark=marks.nextInt();
        if ( mark >= 90 & mark < 100 ) {
            System.out.println("A grade");
        }
        else if (mark >=80 & mark<90) {
            System.out.println("B grade");
        }
        else if (mark>=60&mark<80) {
            System.out.println("c grade");
        }
        else if (mark<60){
            System.out.println("fail");
        }
    else {
            System.out.println("invalid input");
    }
}
}
