package day17_WhileDoWhileLoops;

public class HowManyCatsAndDogs {
    public static void main(String[] args) {
        String sentence = "cat cat dog dog cat cat catacatcatcat ";
        //" cat dog dog"
        //" dog dog"
        sentence = sentence.toLowerCase();

        int countCat = 0; // 2

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);}}