package task1;



import java.lang.reflect.Array;
import java.util.Arrays;

public class MyRestaurant {
    public static void main(String[] args) {

        Cheff mychef1 =new Cheff();
        mychef1.setInfo("BOB",23,23.3,true);
        Cheff mychef2 =new Cheff();
        mychef2.setInfo("Michael",25,27.3,false);
        Cheff mychef3 =new Cheff();
        mychef3.setInfo("Ella",26,26.3,false);
        Cheff mychef4 =new Cheff();
        mychef4.setInfo("Daniel",27,25.3,true);


        Server myserver1=new Server();
        myserver1.setInfo("JILL",45,12.2,false);
        Server myserver2=new Server();
        myserver2.setInfo("JACK",46,15.2,true);
        Server myserver3=new Server();
        myserver3.setInfo("JOHN",47,13.2,true);
        Server myserver4=new Server();
        myserver4.setInfo("GEORGE",48,11.2,false);

        Server[] myservers = {myserver1,myserver2,myserver3};
        Cheff[]  mycheffs={mychef1,mychef2,mychef3};

        Restaurant myrestaurant=new Restaurant("Britney","Johns Creek",5);
        System.out.println(myrestaurant);
         myrestaurant.addServer(myserver1);
         myrestaurant.addChef(mychef1);
         myrestaurant.addCheffs(mycheffs);
         myrestaurant.addServers(myservers);


        System.out.println(Arrays.toString(mycheffs));
        System.out.println(Arrays.toString(myservers));
        System.out.println(myrestaurant);





    }}

