import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        System.out.println("enter a marks");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        int count=0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }
            }
        if (count == 0) {
            System.out.println("prime number");
        }
        else {
            System.out.println("not prime number");
        }
    }
}
