package Day3;

import java.util.Scanner;

public class Opp_main_ex1 {
    public static void main(String[] args) {
        // tao doi tuong
        Oop_ex1 d1=new Oop_ex1();
        d1.id=1;
        d1.name = "Cho";
        d1.color="den";
        d1.age=2;
        d1.eat();
        d1.run();
        // tao doi tuong d2 - du lieu nhap tu ban phim
        //dung cac phuong thuc: run(),eat(), sleep()
        Scanner sc=new Scanner(System.in);
        Oop_ex1 d2=new Oop_ex1();
        System.out.println("Nhap id cho: ");
        d2.id= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten cho: ");
        d2.name= sc.nextLine();
        System.out.println("Nhap mau cho: ");
        d2.color=sc.nextLine();

        sc.close();
        d2.eat();
        d2.run();
        d2.sleep();
    }
}
