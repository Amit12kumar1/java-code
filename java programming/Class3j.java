
import java.util.Scanner;
public class Class3j {
    public static void main(String[] args) {
        System.out.println("enter your choice.");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        switch (name) {
            case "train":
            case "Train":
                System.out.println("train ticket bocked successfully. ");
                break;
            case "flight":
            case "Flight":
                System.out.println("flight ticket bocked successfully. ");
                break;
            case "bus":
            case "Bus":
                System.out.println("bus ticket bocked successfully. ");
                break;
            default:
            System.out.println("invalid input.");


        }
    }
}











