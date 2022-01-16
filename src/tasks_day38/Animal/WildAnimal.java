package tasks_day38.Animal;

public class WildAnimal extends Animal {

    private static boolean isWild =true ;
    private static boolean  isFriendly= false;
    private static boolean isPlayable = false;

    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        WildAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        WildAnimal.isFriendly = isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public static void setIsPlayable(boolean isPlayable) {
        WildAnimal.isPlayable = isPlayable;
    }

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt() {
        System.out.println(getName() + "  " + getBreed() + " is hunting");

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
    }

}
    /*
    Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()

     */