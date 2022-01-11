package day21_ForEachLoopIntro.Tasks;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str="aaahhghhgjbcde";
        int frequency =frequency("asdasdasdas",'s');

    }

    public static int  frequency(String str ,char ch) {

         int count =0;

        for (int each:str.toCharArray()) {
            if(each==ch){
            count++;

        }}

        return count;
    }
}
