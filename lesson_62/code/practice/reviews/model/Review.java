package practice.reviews.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Review implements Comparable<Review> {
    private long id;
    private int rating;
    private String author;
    private String product;
    private String comment;
    private int likes;
    public LocalDateTime date;

    public Review(int rating, String author, String product, String comment,int likes) {
        this.rating = rating;
        this.author = author;
        this.product = product;
        this.comment = comment;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getProduct() {
        return product;
    }

    public String getComment() {
        return comment;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", rating=" + rating +
                ", author='" + author + '\'' +
                ", product='" + product + '\'' +
                ", comment='" + comment + '\'' +
                ", likes=" + likes +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review review)) return false;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }

    public int addLike() {
        likes++;
        return likes ;
    }




    @Override
    public int compareTo(Review o) {
        return this.date.compareTo(o.getDate());
    }
    public int compareToRating(Review o) {
        return this.rating-(o.rating);
    }
}
