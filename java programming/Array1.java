import java.util.Scanner;
//array user input.
public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int size = sc.nextInt();
        int a[] = new int[size];
        int i;
        for (i=0;i<a.length; i++){
            a[i]=i++;
            System.out.println("a["+i+"]="+a[i]);
        }
        System.out.println(a.length);
    }

}
