public class DVD<T extends Comparable<T>>  {
    private String authorName, albumName;
    private int year;

    public DVD(String authorName, String albumName, int year) {
        this.authorName = authorName;
        this.albumName = albumName;
        this.year = year;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getYear() {
        return year;
    }
}
