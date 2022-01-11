package tasks_day36.Planet;

public class Planet {
   public String name;
   public double mass;
   public double radius;
   public double surfaceGravity;
   public double getSurfaceArea;
   public double volume;
   public double population ;



    public void setInfo(String name, double mass, double radius, double surfaceGravity, double getSurfaceArea,
                  double volume, int population){
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.getSurfaceArea = getSurfaceArea;
        this.volume = volume;
        this.population = population;

    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", getSurfaceArea=" + getSurfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }

    public void climateChange(){
        System.out.println(name + " is changing climate");
    }
    public void moveAroundTheSun(){
        System.out.println(name + " is moving around the Sun");
    }

}
