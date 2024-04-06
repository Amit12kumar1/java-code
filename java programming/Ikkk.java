
import java.util.Scanner;
public class Ikkk{
    public static void main(String[] args) {
        System.out.println("enter your choice.");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        if ("bus" .equals(name)){
            System.out.println("bus ticket is bocked");
        }

         else if( "train".equals(name) ){
            System.out.println("Train ticket is bocked");
        }
        else {
            System.out.println("invalid input");


        }
    }

}
