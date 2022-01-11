package task1;

public class MyMovie {
    public static void main(String[] args) {

        Casting star1 = new Casting("ZEKI MUREN", 56, 'M');
        Casting star2 = new Casting("Kivac Tatlitug", 32, 'M');
        Casting star3 = new Casting("Binnur Kaya", 45, 'F');
        Casting star4 = new Casting("Demet Evgar", 56, 'F');

        Casting[] stars = {star1, star2, star3, star4};

        Movie ontheatres = new Movie("Turkey", "Star Wars", "Horror", 2022, "Tarantino");

        ontheatres.addCast(star1);
        ontheatres.addCasts(stars);


        System.out.println(ontheatres);


    }
}
