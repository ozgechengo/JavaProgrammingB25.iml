package interview;

public class Replace {

    public static void main(String[] args) {

       String str="xcodex";

       if(str.contains("x")){
           str=str.replace("x","a");
        }


        System.out.println(str);

    }

}



///*
//Write a program that asks user to enter a word. and replace all the x or X with character a
//                    Input:
//                        xcodeX
//                    Output:
//                        acodea
//
//*/