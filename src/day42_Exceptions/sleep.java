package day42_Exceptions;

public class sleep {


    public static void sleep5sec(){


        try {


            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
