package Day3;

import java.util.Random;

public class Example3 {
    // ham khong co gia tri tra ve va khong co tham so
    public static void sayHello(){
        System.out.println("Hello");
    }
    //ham khong co gia tri tra ve va cop tham so
    public static void sayHello(String language){
        System.out.println("heloo "+language);
    }
    // ham co gia tri tra ve va khong co tham so
    public static int getRandomNumber(){
        return new Random().nextInt(1000);
    }

    // ham co tham so va co gia tri tra ve
    // Viet ham tinh tong 2 so thuc

    public static double sumAB(double a, double b){
        return (a+b);
    }
    public static void main(String[] args) {
        sayHello();
        sayHello("PHP");
        int number1=getRandomNumber();
        int number2=getRandomNumber();
        System.out.println("Tong = "+(number1+number2));
        double x=1.5, y=2.5,z=3.5;
        double k= sumAB(sumAB(x,y),z);
        System.out.println("Tong 3 so la: "+k);
    }
}
