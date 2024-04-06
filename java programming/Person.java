import javax.xml.namespace.QName;

public class Person {
    String name;
    int rollNo;
    String country;
    float hight;
    String fatherName;
    static void m1(){
        System.out.println("stop");
    }
    static void m2(){
        System.out.println("go");
    }
    public static void main(String[] args) {
        Person c=new Person();
        c.name="amit";
        c.rollNo=5;
        c.country="indian";
        c.hight=8;
        c.fatherName="abcd";
        System.out.println(c.name);
        System.out.println(c.rollNo);
        System.out.println(c.country);
        System.out.println(c.hight);
        System.out.println(c.fatherName);
        m1();
        m2();

    }
}
