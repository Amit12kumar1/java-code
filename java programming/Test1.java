public class Test1 {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        o :for (int i=1;i<=a;i++){
           inner : for (int j=1;j<=b;j++) {
                System.out.println(j);
                if (j==3)
                    break o;
            }

//                System.out.println(j);
//                if (j == 2)
//                    break;
            }



    }






}
