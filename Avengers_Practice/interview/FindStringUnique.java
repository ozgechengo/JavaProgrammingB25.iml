package interview;

public class FindStringUnique {


    public static void main(String[] args) {

        String str = "asdaskdkjjsadkl";
        System.out.println(findUniuque(str));
    }
    public static String findUniuque(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char unique = str.charAt(i);

            if (str.indexOf(unique) == str.lastIndexOf(unique)) {

         //  index off ile ilk ve son goruldugu yeri karsilastiriyor.
                result += unique;
            }
        }

        return result;
    }
}
