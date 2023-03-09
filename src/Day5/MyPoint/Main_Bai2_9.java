package Day5.MyPoint;

public class Main_Bai2_9 {
    public static void main(String[] args) {
        MyPoint v1=new MyPoint(0,3);
        MyPoint v2=new MyPoint(4,0);
        MyPoint v3=new MyPoint(4,3);
        MyTriangle triangle=new MyTriangle(v1,v2,v3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
    }
}
