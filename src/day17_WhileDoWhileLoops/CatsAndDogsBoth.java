package day17_WhileDoWhileLoops;

public class CatsAndDogsBoth {
    public static void main(String[] args) {
        String s = "java java java python python python";

        int countJava =0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }


}
