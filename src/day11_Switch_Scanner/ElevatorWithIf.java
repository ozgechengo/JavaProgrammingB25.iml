package day11_Switch_Scanner;

public class ElevatorWithIf {
    public static void main(String[] args) {
        int floorNumber =1;
        //Solution1

        if(floorNumber==1|| floorNumber==2 || floorNumber==3){

            if(floorNumber==1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber==2){
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stakehouse");
            }

        }else{
            System.out.println("Invalid Floor - 6");
        }
    }
}
