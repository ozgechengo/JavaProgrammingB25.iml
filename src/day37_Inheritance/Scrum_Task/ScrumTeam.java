package day37_Inheritance.Scrum_Task;

import java.util.ArrayList;

public class ScrumTeam {

        public ProductOwner PO;
        public BussinessAnalyst BO;
        public ScrumMaster SM;

        public ArrayList<Tester> testers=new ArrayList<>();
        public ArrayList<Developer> developers=new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BussinessAnalyst BO, ScrumMaster SM) {

        this.PO = PO;
        this.BO = BO;
        this.SM = SM;
    }

    public void addTester(Tester tester){



    }
}
