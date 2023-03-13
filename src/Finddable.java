import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Finddable implements Findable {

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println(m);
        }

        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Пишите название фильма:");
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine().toUpperCase().trim();
        for (Movie m : movies) {
            if (m.getName().toUpperCase().toUpperCase().trim().equals(movie)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Пишите имена актеров");
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        for (Movie movie : movies) {
            for (Cast c : movie.getCasts()) {
                if (c.getActorFullName().equals(actorName)) {
                    System.out.println(c.toString());
                }
            }
        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Пишите год выхода фильма");
        int yaers = new Scanner(System.in).nextInt();
        for (Movie s : movies) {
            if (s.getYear() == yaers) {
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Пишите имени режисера:");
        String nameDirector = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie a : movies) {
            if (a.getDirector().getName().toUpperCase().equals(nameDirector)) {
                System.out.println("Director Name: " + a.toString());
            } else if (a.getDirector().getLastName().toUpperCase().equals(nameDirector)) {
                System.out.println("Director Last Name: " + a.toString());
            }
        }

    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Пишите жанр фильма:");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine().toUpperCase();
        for (Movie m : movies) {
            if (m.getDescription().toUpperCase().equals(op)) {
                System.out.println("Description :" + m);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Пишите кто в ролях:");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine().toUpperCase();
        for (Movie c : movies) {
            for (Cast s : c.getCasts()) {
                if (s.getRole().toUpperCase().equals(sc)) {
                    System.out.println("Glavnui rol" + s);
                }
            }
        }
    }
}