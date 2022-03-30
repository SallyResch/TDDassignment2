public class Movie extends Library {
    private int copies;

    public int getCopies() {
        return copies;
    }

    public void addCopy(String movieTitle, int movieNumber, double movieLength) {
      copies++;
    }

}
