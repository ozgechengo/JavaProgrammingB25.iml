package day20_Arrays;

import java.util.Arrays;

public class denemeler {
    public static void main(String[] args) {

        char[]letters=new char[26];

                for (char i = 'Z',j=0; i >='A' && j<=26; i--,j++) {
                    letters[j]=i;
                }

                System.out.println(Arrays.toString(letters));
            }
        }
