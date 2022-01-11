package tasks_day36.Planet;

public class PlanettObject {
    public static void main(String[] args) {


    Earth earth = new Earth();
        earth.setInfo("Earth", 5.9,3.959, 1.0, 5.100,
                1.083,791000000);
        earth.climateChange();
        earth.moveAroundTheSun();
        System.out.println(earth);


    Moon moon = new Moon();
        moon.setInfo("Moon", 0.073, 1.737, 0.166,3.793,
                2.1958,0);
        moon.climateChange();
        moon.moveAroundTheSun();
        System.out.println(moon);


    Mercury mercury= new Mercury();
        mercury.setInfo("Mercury", 0.330, 1.516, 0.378,
                7.48,6.083,0);
        mercury.climateChange();
        mercury.moveAroundTheSun();
        System.out.println(mercury);

    Venus venus= new Venus();
        venus.setInfo("Venus", 4.87, 3.760, 0.907,
                4.60, 9.2843, 500000000); // Venusians
        venus.climateChange();
        venus.moveAroundTheSun();
        System.out.println(venus);



}
}

