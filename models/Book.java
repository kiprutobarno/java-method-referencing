package models;

public class Book {
    String title;
    String author;
    Integer year;
    Integer copiesSoldInMillions;
    Double rating;
    Double cost;

    public Book(String title, String author, Integer year, Integer copiesSoldInMillions, Double rating, Double cost) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.copiesSoldInMillions = copiesSoldInMillions;
        this.rating = rating;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCopiesSoldInMillions() {
        return copiesSoldInMillions;
    }

    public void setCopiesSoldInMillions(Integer copiesSoldInMillions) {
        this.copiesSoldInMillions = copiesSoldInMillions;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book {title=" + title + ", author=" + author + ", year=" + year + ", copiesSoldInMillions="
                + copiesSoldInMillions + ", rating=" + rating + ", cost=" + cost + "}";
    }

}
