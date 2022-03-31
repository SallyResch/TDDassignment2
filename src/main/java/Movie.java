public class Movie extends Library {
    protected int copies;

    public int getCopies() {
        return copies;
    }

    public void addCopy(Movie movie) {
      copies++;
    }

    public void removeOneCopy() {
        copies--;
    }
}
