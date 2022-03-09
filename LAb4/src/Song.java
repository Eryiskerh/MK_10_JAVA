import java.util.Objects;

public class Song implements Comparable<Song> {
    private String title;
    private int year;
    private Singer singer;


    public Song(String title, int year, String singer) {
        this.title = title;
        this.year = year;
        this.singer = new Singer(singer);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Singer getSinger() {
        return singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return year == song.year && Objects.equals(title, song.title) && Objects.equals(singer, song.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYear(), getSinger());
    }

    @Override
    public String toString() {
        return String.format("title: %s, year: %d, singer: %s\n", title, year, singer.getName());
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.title);
    }
}
