package day42_Exceptions;

public class sleep5sec {


    public static void sleep5sec(){


        try {


            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
