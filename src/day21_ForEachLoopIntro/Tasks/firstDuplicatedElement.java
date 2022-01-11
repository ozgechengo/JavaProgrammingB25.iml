package day21_ForEachLoopIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class firstDuplicatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each : list) {
            int freq=0;
            for (int i = 0; i < list.size(); i++) {
                if(each==list.get(i)){
                    freq++;
                }
            }
            if(freq==2){
                System.out.println(each);
                break;
            }
        }}}