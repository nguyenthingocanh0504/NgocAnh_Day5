package Day3;

public class Example1 {
    //Viet ham cos input: chuoi bat ky -> in ra chuoi viet hoa
    //Ten ham: inChuoiVietHoa()

    //Static: tinh -> phuong thuw thuoc lop
    //phuong thuc thuoc so luong

    public static void inChuoiVietHoa(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        // Method - phuong thuc - ham -> dinh nghia
        // De suw dung can goi dne ham va truyen vao cac tham so

        inChuoiVietHoa("Hello");
        inChuoiVietHoa("Hi");
    }
}
