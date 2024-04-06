import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number.");
        double num=sc.nextDouble();
        double result=num/2;
        if (result%2==0){
            double intResult=(int) result;
            System.out.println("result="+intResult);
        }
        else {
            System.out.println("result"+result);
        }
    }
}
