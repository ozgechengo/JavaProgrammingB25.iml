package tasks_day38.Device;

public class Desktop extends Computer {


    public Desktop(String brand, String model, double price) {
        super(brand, model, price);
    }



    public void playGames(){
        System.out.println(getModel()+ "  ready to play !!");
    }

    public void studying(){
        System.out.println(getModel()+ "  ready to study !!");
    }


}


