import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Jek ", "Chan");
        Director director1 = new Director("Donni", "Yean");
        Cast cast1 = new Cast("Ipman", "Action rol");
        Cast cast = new Cast("Cris Taker", "Glavnui rol");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Chas Pik2", 2012, "Comedy movie", director, new ArrayList<Cast>(Arrays.asList(cast))));
        movies.add(new Movie("Ipman", 2010, "Kung Fu", director1, new ArrayList<Cast>(Arrays.asList(cast1))));
        Finddable finddable = new Finddable();
        SortableClass sortableClass = new SortableClass();
        System.out.println("""
                1 Все фильмы.
                2 Название все фильма.
                3 Актеры.у
                4 Год выхода фильма.
                5 Режисер фильма.
                6 Жанры фильма.
                7 В роле.
                8 Сортируем по имени.
                9 Сортируем по год выпуска.
                10 Сортируем по режисеру.
                """);
        while (true) {
            int a = new Scanner(System.in).nextInt();

            switch (a) {

                case 1 -> System.out.println(finddable.getAllMovies(movies));
                case 2 -> finddable.findMovieByName(movies);
                case 3 -> finddable.findMovieByActorName(movies);
                case 4 -> finddable.findMovieByYear(movies);
                case 5 -> finddable.findMovieByDirector(movies);
                case 6 -> finddable.findMovieByDescription(movies);
                case 7 -> finddable.findMovieByRole(movies);
                case 8 -> sortableClass.sortMyMovieName(movies);
                case 9 -> sortableClass.sortByYear(movies);
                case 10 -> sortableClass.sortMyDirector(movies);
            }

        }

    }
}