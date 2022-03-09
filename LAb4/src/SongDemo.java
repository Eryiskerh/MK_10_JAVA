import java.util.Arrays;
import java.util.Comparator;

public class SongDemo {
    final private int countOfSongs = 3;
    private Song[] songs = new Song[countOfSongs];
    private  SongRecord[] songsRec = new SongRecord[countOfSongs];

    public static void main(String[] args) {
        new SongDemo().Start();
    }

    private void Start(){
        // Enter songs //
       // songs= ;
        songs[0] = new Song("Down with the Sickness", 2000, "Disturbed");
        songs[1] = new Song("Teacher, Teacher!", 2019,"Jinjer ");
        songs[2] = new Song("Was ist hier los?", 2017,"Eisbrecher");

        songsRec[0] = new SongRecord("Down with the Sickness", 2000, new Singer("Disturbed"));
        songsRec[1] = new SongRecord("Teacher, Teacher!", 2019, new Singer("Jinjer "));
        songsRec[2] = new SongRecord("Was ist hier los?", 2017, new Singer("Eisbrecher"));

        //  Sort //
        Sort(songs);
        SortRecord(songsRec);
    }

    private  void  Sort(Song[] songs){
        // by title
        Arrays.sort(songs);
        PrintAll(songs, "by title");
        // by year
        Arrays.sort(songs, new YearComparator());
        PrintAll(songs,"by year");
        //by Singer
        Arrays.sort(songs, new SingerComparator());
        PrintAll(songs,"by Singer");
    }

    private void SortRecord(SongRecord[] songs){
        // by title
        Arrays.sort(songsRec);
        PrintAllRecord(songsRec, "by title");
        // by year
        Arrays.sort(songsRec, new YearComparatorRecord());
        PrintAllRecord(songsRec,"by year");
        //by Singer
        Arrays.sort(songsRec, new SingerComparatorRecords());
        PrintAllRecord(songsRec,"by Singer");
    }

    class YearComparator implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getYear() - o2.getYear();
        }
    }

    class YearComparatorRecord implements Comparator<SongRecord> {
        @Override
        public int compare(SongRecord o1, SongRecord o2) {
            return o1.year() - o2.year();
        }
    }

    class SingerComparator implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getSinger().getName().compareTo(o2.getSinger().getName());
        }
    }

    class SingerComparatorRecords implements Comparator<SongRecord> {
        @Override
        public int compare(SongRecord o1, SongRecord o2) {
            return o1.singer().getName().compareTo(o2.singer().getName());
        }
    }

    private void PrintAll(Song[] songs, String howToCompare){
        System.out.println(howToCompare);
        for (Song song: songs) {
            System.out.println(song.toString());
        }
    }

    private void PrintAllRecord(SongRecord[] songs, String howToCompare){
        System.out.println(howToCompare);
        for (SongRecord song: songs) {
            System.out.println(song.toString());
        }
    }
}
