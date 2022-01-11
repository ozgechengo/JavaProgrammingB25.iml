package task1;

public class MovieObject {
    public static void main(String[] args) {

        Casting star1 = new Casting("Asiya", 25, 'M');
        Casting star2 = new Casting("Adam", 26, 'M');
        Casting star3 = new Casting("Muhtar", 27, 'M');
        Casting star4 = new Casting("Hilal", 28, 'F');

        Casting[] stars = {star1, star2, star3, star4};

        Movie movie = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "Horror", 2022, "Kuzzat Altay");

        movie.addCast(star1);
        movie.addCasts(stars);


        System.out.println(movie);


    }
}



/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie

 */