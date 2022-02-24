package day43_ABSTRACTION.CAR;



    public final class Audi extends car  {


        public Audi( String model, String color, int year, double price) {
            super("Audi", model, color, year, price);
        }


        public void start() {
            System.out.println("Push the start button");
        }

        public void autoPark(){
            System.out.println(getBrand()+" "+getModel()+" has auto park feature");
        }

    }

