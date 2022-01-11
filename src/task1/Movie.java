package task1;



import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title,Genre, director;
    public int  releaseDate;
    public ArrayList<Casting> castingList = new ArrayList<>();

    public Movie(String country, String title, String Genre, int releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre = Genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(Casting casting) {
        castingList.add(casting);

    }

    public void addCasts(Casting [] casts) {
        castingList.addAll(Arrays.asList(casts));


    }

    public String toString() {
        return "Movie{" +
                "Country='" + country + '\'' +
                ", Title='" + title + '\'' +
                ", Genre='" +Genre + '\'' +
                ", ReleaseDate='" + releaseDate + '\'' +
                ", Director='" + director + '\'' +
                ", Number of Casts =" + castingList.size() +
                 " STARZ'" + castingList + '\'' +
                '}';
    }
}



 /*
   }
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }
3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

 */