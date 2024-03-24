import java.util.ArrayList;
import java.util.List;

import interfaces.Consumer;
import interfaces.Function;
import models.Book;
import utils.BookDB;

public class App {
    public static void main(String[] args) {

        List<Book> books = BookDB.getAllBooks();
        books.sort(App::compareBooksByRating);
        var mappedBooks = map(books, (Book b) -> b.getTitle() + " -> " + b.getRating());
        forEach(mappedBooks, System.out::println);

    }

    public static int compareBooksByRating(Book a, Book b) {
        return b.getRating().compareTo(a.getRating());
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