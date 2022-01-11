package day11_Switch_Scanner;

public class ElevatorWithSwitch {
    public static void main(String[] args) {
        int number= 4;
        String text = " ";
          switch (number){
              case 1 :
            text ="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
          break;
              case 2 :
            text ="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
          break;
              case 3 :
           text   ="Floor 3 selected. Companies: Lyft, BofA, Stakehouse";
              default :
            text   ="INVALID NUMBER" ;}

        System.out.println(text);





    }


}
