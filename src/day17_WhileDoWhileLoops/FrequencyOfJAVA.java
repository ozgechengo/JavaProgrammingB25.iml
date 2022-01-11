package day17_WhileDoWhileLoops;

public class FrequencyOfJAVA {
    public static void main(String[] args) {

        String word = "java JHJDA java javajavaAHa java";
        int frequency = 0;

        while (word.contains("java")){
            word=word.replaceFirst("java","");
             frequency++;
        }
           System.out.println("frequency is "+ frequency);
    }
}