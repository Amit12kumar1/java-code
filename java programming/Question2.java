import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        double num1=sc.nextDouble();
        System.out.println("enter second number");
        double num2=sc.nextDouble();
        double divisionResult=num1/num2;
        if (divisionResult%1==0) {
            int tResult = (int) divisionResult;
            System.out.println("divosionResult" + tResult);
        }
        else{
            int rResult=(int)divisionResult;
            System.out.println("Divion result"+rResult);
        }
    }
}
