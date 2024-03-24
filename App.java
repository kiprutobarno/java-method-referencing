import java.util.ArrayList;
import java.util.List;

import interfaces.Consumer;
import interfaces.Function;
import models.Book;

public class App {
    public static void main(String[] args) {

    }

    public static int compareBooksByRating(Book a, Book b) {
        return a.getRating().compareTo(b.getRating());
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> results = new ArrayList<>();
        for (T t : list) {
            results.add(f.apply(t));
        }

        return results;
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }
}