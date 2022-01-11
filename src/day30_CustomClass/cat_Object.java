package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class cat_Object {
    public static void main(String[] args) {

    Cat cat1=new Cat() ;
    cat1.setInfo("DAISY","BRITISH",2,"GRAY",1200,"SHORT");

    Cat cat2=new Cat();

    cat2.setInfo("Lokum","BRITIHS",1,"WHITE &GRAY",1400,"MEDIUM");

    Cat cat3=new Cat();
    cat3.setInfo("Duman","British",4,"GRAY",1000,"SHORT");

    Cat cat4=new Cat();

    cat4.setInfo("FERO","BRITISH",3,"GOLDEN",1700,"SHORT");

         Cat[] cats={cat1,cat2,cat3,cat4};
        ArrayList<Cat> list=new ArrayList<>();
        list.addAll(Arrays.asList(cats));



        System.out.println(list);

      list.removeIf(p-> p.hair.equals("SHORT"));



        System.out.println(list);



    }
}
