public class Shap {
    int numOfShap=1;
    public static void main(String[] args) {
        Shap triangle = new Shap();
        triangle.numOfShap=3;
        Shap rectangle =new Shap();
        rectangle.numOfShap=4;
        Shap circle = new Shap();
        circle.numOfShap=0;
        System.out.println("No of side"+triangle.numOfShap);
        System.out.println("Nn of side"+rectangle.numOfShap);
        System.out.println("Nn of side"+circle.numOfShap);




    }
}
