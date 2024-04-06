import java.util.Scanner;

public class Neven {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        for (int i=1;i<=number;i++) {
            if (i % 2 == 0) {
                System.out.println("even number"+i);
            }
        }
        }


}
