import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character.");
        char inputchar=sc.next().charAt(0);
        int asc=(int) inputchar;
        System.out.println("enter character ascii value."+asc);
    }
}
