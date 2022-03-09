import java.lang.Record;

public record SongRecord(String title, int year, Singer singer) implements Comparable<SongRecord>{

    @Override
    public int compareTo(SongRecord o) {
        return this.title.compareTo((o.title));
    }
}
