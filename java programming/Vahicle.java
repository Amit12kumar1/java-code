public class Vahicle {
   static int no;
   int make;
   char ch;
    String model="thg";
    static void m1()
    {
        System.out.println("hello");
    }



     public static void main(String[] args) {
         int a=0; //local variable
      Vahicle c=new Vahicle();


      Vahicle b=new Vahicle();
         b.model="xyz";
         System.out.println(c.model);
         System.out.println(b.make);
         System.out.println(c.ch);
         System.out.println(c.no);
         m1();
         System.out.println(a);
     }

}
