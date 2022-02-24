package tryDoSmth;

public class FilmDemo {
    public static void main(String[] args) {
        final int coutOfFilms=5;
        Film[] myFilms = new Film[coutOfFilms];
        myFilms[0] = new Film("Nightmare Alley", 2022, "Thriller", 7.2);
        myFilms[1] = new Film("Antlers", 2021, "Horror", 5.5);
        myFilms[2] = new Film("The Witches", 2020, "Fantasy", 5.7);
        myFilms[3] = new Film("Pacific Rim: Uprising", 2018, "Fantasy", 5.7);
        myFilms[4] = new Film("The Shape of Water", 2017, "Fantasy", 6.9);
        for (Film film: myFilms) {
            film.SeeFilm();
        }
        Film.setProducer("someone","Qwerty123");
    }
}
