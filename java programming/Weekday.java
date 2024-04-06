import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        System.out.println("enter day letter");
        Scanner n = new Scanner(System.in);
        String day = n.nextLine();
        switch (day) {
            case "1":
                System.out.println("sunday");
                break;
            case "2":
                System.out.println("monday");
                break;
            case "3":
                System.out.println("tuesday");
                break;
            case "4":
                System.out.println("wednesday");
                break;
            case "5":
                System.out.println("thursday");
                break;
            case "6":
                System.out.println("friday");
                break;
            case "7":
                System.out.println("starday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }

        }
}
