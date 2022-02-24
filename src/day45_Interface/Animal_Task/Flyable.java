package day45_Interface.Animal_Task;

public interface Flyable {

    boolean canFly=true;

    void fly();
    default void run(){
        System.out.println("run flyable");

    }

}
