package Java2.Day1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Tao tu dien anh viet
        Ex1<String, String > myDictiondary=new Ex1<>();
        myDictiondary.setK("Hello");
        myDictiondary.setV("Xin chao");
        System.out.println(myDictiondary);

        //1 tu tieng anh, ung voi nhieu tu tieng viet
        Ex1<String,String[] > myDicitiondary1 = new Ex1<>();
        myDicitiondary1.setK("hi");
        myDicitiondary1.setV(Arrays.asList("Xin chao", "chao", "Loi chao").toArray(new String[0]));
        System.out.println(myDicitiondary1);
    }
}
