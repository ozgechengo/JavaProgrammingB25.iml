package interview;

public class CatsAndDogs {


    public static void main(String[] args) {

        System.out.println(howmanyappears("cat cat cat dog dog dog dog"));


    }


    public static boolean howmanyappears(String str) {


        str.toLowerCase();
        int count = 0;
        int count1 = 0;

        while (str.contains("cat")) {
            str = str.replaceFirst("cat", "");
            count++;

        }

        while (str.contains("dog")) {
            str = str.replaceFirst("dog", "");
            count1++;

        }

        return count == count1;
    }


}
///*
//write a program to print true if the string "cat" and "dog" appear the
//same number of times in the given sentence
//        Ex:
//            sentence = "caT dog dogG cAt"
//            output:
//                true
// */