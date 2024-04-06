import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char inputchar=sc.next().charAt(0);
        int ascvalue=(int) inputchar;
        System.out.println("ascii value of "+ascvalue);
        System.out.println("enter a decimal value; ");
        int decimalvalue=sc.nextInt();
        int sum=ascvalue+decimalvalue;
        System.out.println("sum of ascii value and decimal value"+sum);
        char resultchar=(char) sum;
        System.out.println("character of sum value is."+resultchar);
    }
}
