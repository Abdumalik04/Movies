import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortableClass implements Sortable {
    @Override
    public void sortMyMovieName(List<Movie> movies) {

        System.out.println("""
                1 Sort Movie A-Z
                2 Sort Movie Z-A""");
        int f = new Scanner(System.in).nextInt();
        switch (f) {
            case 1:
                movies.sort(comparator);
                for (Movie r : movies) {
                    System.out.println(r);
                }
                break;
            case 2:
                Collections.reverse(movies);
                for (Movie a : movies) {
                    System.out.println(a);
                }
                break;
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
movies.sort(sortComparatorYear);
        for (Movie s:movies) {
            System.out.println(s.getName()+s.getYear());
        }
    }

    @Override
    public void sortMyDirector(List<Movie> movies) {
movies.sort(sortDirectorComparator);
        for (Movie a:movies) {
            System.out.println(a.getDirector().getName()+"\n"+a.getName());
        }
    }

    public static Comparator<Movie> comparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return
                    o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> sortComparatorYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };

    public static Comparator<Movie> sortDirectorComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getDirector().getName().compareTo(o1.getDirector().getName());
        }
    };
}
