package practice.reviews.dao;

import practice.reviews.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RatingImpl implements Ratings {
    Collection<Review> reviews;

    public RatingImpl(Collection<Review> reviews) {
        this.reviews = new ArrayList<>();
    }

    @Override
    public boolean add(Review review) {
        return reviews.add(review);
    }

    @Override
    public boolean remove(Long id) {
        return reviews.removeIf( review -> review.getId() == id);
    }

    @Override
    public boolean update(Long id, int newRating) {
        for (Review review: reviews) {
            if(review.getId() == id){
                review.setRating( newRating );
                return true;
            }

        }
        return false;
    }

    @Override
    public Iterable<Review> getReviewsByProduct(String product) {

        return reviews.stream()
                .filter(review -> review.getProduct().equals(product))
                .collect( Collectors.toList());
    }

    @Override
    public Iterable<Review> getReviewsByAuthor(String author) {
        return reviews.stream()
                .filter(review -> review.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public double getAvgRatingByProduct(String product) {
        return reviews.stream()
                .filter(review -> review.getProduct().equals(product))
                .mapToInt(Review::getRating)
                .average()
                .orElse(0);
    }

    @Override
    public Iterable<Review> getReviewWithMaxLikes() {

        int max = reviews.stream()
                .mapToInt(Review::getLikes)
                .max()
                .orElse(0);

        return reviews.stream()
                .filter(review -> review.getLikes() == max)
                .collect(Collectors.toList());
    }
    public static double calculateProductRating(List<Review> reviews, String product) {
        List<Review> productReviews = new ArrayList<>();    for (Review review : reviews) {
            if (review.getProduct().equalsIgnoreCase(product)) {
                productReviews.add(review);}
        }
        if (productReviews.isEmpty()) {
            return 0; // Нет отзывов о продукте
        }
        double totalRating = 0;
        for (Review review : productReviews) {
            totalRating += review.getRating();
        }
        return totalRating / productReviews.size();
    }
}
