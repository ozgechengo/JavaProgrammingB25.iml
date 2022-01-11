package tasks_day35;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);



    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (size == 'M' || size == 'L' || size == 'S') {
            this.size = size;
        } else {
            System.err.println("INVALID SIZE ,SELECT SIZE AGAIN ! ");
            System.exit(0);

        }
    }


    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;

    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
         if(!(numberOfCheeseTopping>0)){
             System.out.println("You can not select '0' for cheese topping " );
         }
        if     (size == 'S' && !(numberOfCheeseTopping <= 3 ) ||
                size == 'M' && !(numberOfCheeseTopping <= 4  ) ||
                size == 'L' && !(numberOfCheeseTopping <= 5 ) ){
               System.out.println("INVALID CHEESE CHOICE");
            System.exit(0);


        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
           if(!(numberOfPepperoniTopping>0)){
               System.out.println("You can not select '0' for pepperoni topic " );
        }
        if     (size == 'S' && !(numberOfPepperoniTopping <= 4 )||
                size == 'M' && !(numberOfPepperoniTopping <= 5) ||
                size == 'L' && !(numberOfPepperoniTopping <= 6 )) {
            System.out.println("INVALID  PEPPERONI CHOICE");
            System.exit(0);

        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calCost() {
        double cost = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;
               cost += numberOfCheeseTopping * 2 + numberOfPepperoniTopping * 2;
        return cost;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total calcost" + calCost() +
                '}';
    }


    public static void main(String[] args) {

        Pizza pizza = new Pizza('M', 12, 41);

        System.out.println(pizza);
        pizza.calCost();


    }
}
