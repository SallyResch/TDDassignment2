import java.util.ArrayList;
import java.util.Collection;

public class Library {
    protected final ArrayList<Movie> catalogue= new ArrayList<>();

    public void donate(Movie movie) {
        catalogue.add(movie);
        movie.addCopy(movie);
        movie.addCopy(movie);
        movie.addCopy(movie);
        movie.addCopy(movie);
        movie.addCopy(movie);
    }

    boolean contains (Movie movie){
        return catalogue.contains(movie);
    }
}
