package day45_Interface.Animal_Task;

public interface Meow {

    void meow();
    default void run(){
        System.out.println("run flyable");

    }

}

