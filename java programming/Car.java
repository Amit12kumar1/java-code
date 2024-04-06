public class Car {
    int numberofdoor;
    Car(int numberofdoor){
        this.numberofdoor=numberofdoor;
        System.out.println("car no of door"+numberofdoor);
    }

    public static void main(String[] args) {
        Car obj2=new Car(4);
    }
}
