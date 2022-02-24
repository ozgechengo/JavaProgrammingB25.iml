package day45_Interface.Animal_Task;

public abstract class Animal {
    private String breed,name,color,size;
    private final char gender;
    private int age;


    public Animal(String breed, String name, String color, String size, char gender, int age) {
          if( !(gender =='F' || gender=='M') ){
              throw new RuntimeException("INVALID GENDER");
          }
          this.gender=gender;
          setColor(color);
          setAge(age);
          setSize(size);
          setName(name);
          setBreed(breed);

     }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {

        return age;
    }


    public void setBreed(String breed) {
        if (breed.isBlank() || breed.isEmpty() || breed==null) {
            throw new RuntimeException("Breed cannot be empty or blank");
        }
        this.breed = breed;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() || name==null) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
        this.name = name;
    }

    public void setColor(String color) {
        if (color.isBlank() || color.isEmpty() || color==null) {
            throw new RuntimeException("Color cannot be empty or blank");
        }
        this.color = color;
    }

    public void setSize(String size) {
        if (size.isBlank() || size.isEmpty() || size==null) {
            throw new RuntimeException("Size cannot be empty or blank");
        }
        this.size = size;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Invalid  AGE: " + age);
        }
        this.age = age;
    }

    public String toString() {
        return   getClass().getSimpleName() +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
    public abstract void eat();

    public  void drink(){
        System.out.println(" All animals drink water.");
    }

}
