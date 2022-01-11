package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Car_object {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("MERCEDES", "XQX", "BLACK", 2022, 345.666);

        Car car2 = new Car();

        car2.setInfo("INFINITI", "XQ80", "GRAY", 2021, 69.999);

        Car car3 = new Car();

        car3.setInfo("BMW", "MD90", "WHITE", 2020, 120.555);


        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2, car3));


        carList.removeIf(p-> p.brand.equals("BMW"));

        for (Car car : carList) {
            System.out.println(car.brand + "  :   " + car.price);


        }

    }


}

