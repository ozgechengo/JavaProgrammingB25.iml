package tasks_day38.Animal;

public class FriendlyAnimal extends Animal {



    private static boolean isWild=false,
            isFriendly=true,
            isPlayable=true;


    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        FriendlyAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        FriendlyAnimal.isFriendly = isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public static void setIsPlayable(boolean isPlayable) {
        FriendlyAnimal.isPlayable = isPlayable;
    }

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void play(){
        System.out.println(getName()+"  "+getBreed()+" is playing");
    }
    public void pet(){
        System.out.println(getBreed()+" like petting");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", is Wild ='" + isWild + '\'' +
                ", is friendly='" + isFriendly + '\'' +
                ", is playable='" + isPlayable + '\'' +
                '}';
    }}