package day24_CustomMethods_RETURN;

public class name_Of_Month {

    public static void main(String[] args) {

        nameOfMonth(2);
    }

  public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan"
                    :(number==2)?"Feb"
                    :(number==3)?"Mar"
                    :(number==4)?"Apr"
                    :(number==5)?"May"
                    :(number==6)?"Jun"
                    :(number==7)?"Jul"
                    :(number==8)?"Aug"
                    :(number==9)?"Sep"
                    :(number==10)?"Oct"
                    :(number==11)?"Nov"
                    : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }
}
