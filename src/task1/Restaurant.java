package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public  String location;
    public int numberOfStars;

    public ArrayList<Cheff>   cheffList = new ArrayList<>();
    public  ArrayList<Server> serverList = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }



       public void addServer(Server server){
        serverList.add(server);
        }
       public void addServers(Server[] servers){

        serverList.addAll(Arrays.asList(servers));
        }
      public  void addChef(Cheff cheff){
        cheffList.add(cheff);

        }
      public void addCheffs(Cheff[] cheffs){
        cheffList.addAll(Arrays.asList(cheffs));
        }
      public void terminateChef(int employeeID){
          cheffList.removeIf(p-> p.employeeID == employeeID);
      }
    public void terminateServer(int employeeID){
        cheffList.removeIf(p-> p.employeeID== p.employeeID);
    }
      }

