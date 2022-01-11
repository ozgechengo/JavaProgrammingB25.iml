package NewYearTasks;
import java.util.Scanner;

public class Newyear{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter your name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("How much does Santa get paid? Please enter your number");
        String salary = new Scanner(System.in).next();
        Surprise one = new Surprise();
        one.hereWeGo(name, salary);
    }
}

class Surprise {
    public void hereWeGo(String name, String salary) throws InterruptedException {
        String[] array = {"                                 |", "                               \\ ' /", "                             -- (*) --", "                                >*<", "                               >0<@<", "                              >>>@<<*", "                             >@>*<0<<<", "                            >*>>@<<<@<<", "                           >@>>0<<<*<<@<", "                          >*>>0<<@<<<@<<<", "                         >@>>*<<@<>*<<0<*<", "           \\*/          >0>>*<<@<>0><<*<@<<", "       ___\\\\U//___     >*>>@><0<<*>>@><*<0<<", "       |\\\\ | | \\\\|    >@>>0<*<0>>@<<0<<<*<@<<", "       | \\\\| | _(UU)_ >((*))_>0><*<0><@<<<0<*<", "       |\\ \\| || / //||.*.*.*.|>>@<<*<<@>><0<<<", "       |\\\\_|_|&&_// ||*.*.*.*|_\\\\db//_", "       \"\"\"\"|'.'.'.|~~|.*.*.*|     ____|_", "           |'.'.'.|   ^^^^^^|____|>>>>>>|", "           ~~~~~~~~         '\"\"\"\"`------'", "\n", "---------------- CYDEO FAMILY ------------------", "************* HAPPY NEW YEAR 2022 **************", "------------------------------------------------", "************************************************", "  " + name + " wish you 100 job offers", "  with minimum $" + salary + " salary next year!!!", "************************************************"};
        int i = 0;
        for (String s : array) {
            Thread.sleep(600);
            if (i++ >= 24) System.err.println(s);
            else System.out.println(s);
        }
    }
}