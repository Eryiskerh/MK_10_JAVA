package tryDoSmth;
import tryDoSmth.Producer;

public class Film {
    private String name;
    private int dateRelease;
    private String filmGenre;
    private double rating;
    static private Producer producer;
    static String password;

    static {
        producer = new Producer("Guillermo del Toro");
        password = "Str0ngPasswd";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void setProducer(String name, String passwd) {
        if (password.equals(passwd))
            producer.setName(name);
        else
            System.out.printf("\n Can't do it! Wrong password!\n");
    }

    public String getName() {
        return name;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public double getRating() {
        return rating;
    }

    public static String getProducer() {
        return producer.getName();
    }

    public void SeeFilm(){
        System.out.printf("The film: %s, release date: %d, genre: %s, rating: %.1f and produced by %s\n",this.name, this.dateRelease, this.filmGenre, this.rating, this.producer.getName());
    }

    public Film(String name, int dateRelease, String filmGenre, double rating){
        this.name = name;
        this.dateRelease = dateRelease;
        this.filmGenre = filmGenre;
        this.rating = rating;
    }

    public Film(String name, String filmGenre, double rating){
        this.name = name;
        this.filmGenre = filmGenre;
        this.rating = rating;
    }
}

