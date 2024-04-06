import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.println("enter a marks");
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        int count;
        for (int i = 1; i <= num; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print("prime number");
                System.out.println(i);
            }
        }
    }
}





