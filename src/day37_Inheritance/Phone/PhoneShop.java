package day37_Inheritance.Phone;

public class PhoneShop {

    public static void main(String[] args) {

        Nokia nokia=new Nokia("Nokia","3110",'S',120.33,"BLUE");



        nokia.call(232323);
        nokia.selfDefence();
        nokia.text(2321312);
        nokia.call(2321312);


        System.out.println(nokia);

  System.out.println("===========================================================");

        Iphone iphone=new Iphone("APPLE","12 PLUS",'L',1234.3,"bLUE");


        iphone.facetime(323131123);
        iphone.facetime("xxxxx@sadas.com");
        iphone.call(232132111);
        iphone.text(2312313);
        System.out.println(iphone);


        System.out.println("==========================================================");

        Samsung samsung=new Samsung("Samsung","Galaxy",'L',1201.33,"BLUE");

        samsung.freeze();
        samsung.call(23231231);
        samsung.text(33312312);

        System.out.println(samsung);


    }
}
