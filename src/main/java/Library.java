import java.util.ArrayList;

public class Library {
    protected final ArrayList<Movie> catalogue= new ArrayList<>();

    public void donate(Movie movie) {
        catalogue.add(movie);
        movie.addCopy("Ace Ventura - Pet Detective", 1, 1.26);
        movie.addCopy("Shrek",2,1.30);
        movie.addCopy("Nightmare Before Christmas",3,1.16);
        movie.addCopy("Spider-Man: No Way Home", 4,2.28);
        movie.addCopy("Don´t Look Up", 5,2.18);
    }

    boolean contains (Movie movie){
        return catalogue.contains(movie);
    }
}
