import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DonateMovieTest {

    Library library;
    Movie movie;

    @BeforeEach
    void setUp() {
        library = new Library();
        movie = new Movie();
    }

    @Test
    @DisplayName("Movie added to catalogue Test")
    public void movieAddedToCatalogueTest(){
        library.donate(movie);
        assertTrue(library.contains(movie));
    }

    /*@Test
    public void movieNotAddedToCatalogueTest(){
        library.donate(movie);
        assertFalse(library.contains(movie));
    }*/

    @Test
    @DisplayName("Rental copy added")
    public void numberOfRentalCopyAddedTest(){
        library.donate(movie);
        assertEquals(5,movie.getCopies());
    }

    @Test
    @DisplayName("Rental copy added is not equal")
    public void numberOfRentalCopyAddedIsNotEqualTest(){
        library.donate(movie);
        assertNotEquals(3,movie.getCopies());
    }
}
