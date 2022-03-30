public class Movie extends Library {
    private int copies;
    private String movieTitle;
    private int movieNumber;
    private double movieLength;

    public int getCopies() {
        return copies;
    }

    public void addCopy(String movieTitle, int movieNumber, double movieLength) {
      copies++;
    }

    public boolean checkMovieTitle() {
        if (catalogue.contains("Ace Ventura - Pet Detective")) {
            System.out.println("Library contains Ace Ventura - Pet Detective");
        }
        return true;

    }
}
