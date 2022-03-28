
import  org.junit.Test;
import java.sql.Connection;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DonateMovieTest {

    private final Library library;
    private final Movie movie;

    public DonateMovieTest() {
        library = new Library();
        movie = new Movie();
    }

    @Test
    public void movieAddedToCatalogueTest(){
        library.donate(movie);
        assertTrue(library.contains(movie));
    }

    @Test
    public void rentalCopyAddedTest(){
        library.donate(movie);
        assertEquals(1,movie.getCopies());
    }

}
