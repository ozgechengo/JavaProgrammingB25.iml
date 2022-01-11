package day11_Switch_Scanner;

public class ElevatorWithAllTogether {
    public static void main(String[] args) {
        int floor1 = 1 ;
        int floor2 = 2 ;
        int floor3 = 3 ;

        int floorSelection = 1 ;

        if(floorSelection == 1 || floorSelection == 2 ||
                floorSelection == 3 ) {
            switch (floorSelection){
                case 1 :
                    System.out.println("Floor 1 selected: Lobby ,Verizon , Starbucks");
                    break;
                case 2:
                    System.out.println("Floor 2 selected: Cybertek , NASA ,Intelsat ");
                    break;
                default:
                    System.out.println("Floor 3 selected: Lyft  , BoFa , StakeHouse ");}
        }else  {
            System.out.println("WRONG SELECTION");

















    }



}}
