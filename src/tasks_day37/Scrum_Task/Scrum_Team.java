package tasks_day37.Scrum_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrum_Team {

  public Product_Owner PO;
  public Bussiness_Analiysist BA;
  public Scrum_Master SM;


  public ArrayList<Tester> testers=new ArrayList<>();
  public ArrayList<Developer> developers=new ArrayList<>();

  public Scrum_Team(Product_Owner PO, Bussiness_Analiysist BA, Scrum_Master SM) {
    this.PO = PO;
    this.BA = BA;
    this.SM = SM;
  }
  public void addTester(Tester tester){

    testers.add(tester);
    }
  public void addTesters(Tester[] testers){
    this.testers.addAll(Arrays.asList(testers));
  }
  public void removeTesters(int id){
    testers.removeIf(p-> id==id);
  }

  public void addDeveloper(Developer developer){
    developers.add(developer);
  }
  public void addDevelopers(Developer [] developers){
    this.developers.addAll(Arrays.asList(developers));

  }
  public  void removeDeveloper(int id){
    developers.removeIf(p->id==id);
  }

  public String toString() {
    return "Scrum_Team{" +
            "PO=" + PO +
            ", BA=" + BA +
            ", SM=" + SM +
            ", testers=" + testers.size() +
            ", developers=" + developers.size() +
            '}';
  }
}


