package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("CA", "GOOGLE", "SDET", 95.554, true, true, false, true);
        Offer offer2 = new Offer();
        offer2.setInfo("GA", "APPLE", "QA", 102.334, true, false, true, true);
        Offer offer3 = new Offer();
        offer3.setInfo("CA", "HMY", "SDET", 95.554, true, true, false, true);
        Offer offer4 = new Offer();
        offer4.setInfo("FL", "MACYS", "QA", 112.334, false, false, true, true);
        Offer offer5 = new Offer();
        offer5.setInfo("MA", "CYDEO", "SDET", 76.554, false, true, true, true);
        Offer offer6 = new Offer();
        offer6.setInfo("NJ", "Amazon", "QA", 85.334, true, false, true, true);
        Offer offer7 = new Offer();
        offer7.setInfo("NY", "ACER", "SDET", 78.554, false, true, false, true);



        Offer[]myOffers={offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer>fulltimeOffers=new ArrayList<>(Arrays.asList(myOffers));


        fulltimeOffers.removeIf(p->  !p.isFulltime);  //removes if the offer is not fulltime

        System.out.println(fulltimeOffers.size());

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p->!(p.location.equals("GA")|| p.location.equals("CA")));

        System.out.println(localOffers.size());

        ArrayList<Offer>onlyAmazon=new ArrayList<>(Arrays.asList(myOffers));

        onlyAmazon.removeIf(p-> !p.companyName.equals("Amazon"));

        System.out.println(onlyAmazon);
        System.out.println(onlyAmazon.size());

        ArrayList<Offer>offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p->!p.hasBenefits && !p.hasPTO);
        System.out.println(offersWithBenefits);
        System.out.println(offersWithBenefits.size());



    }


    }






