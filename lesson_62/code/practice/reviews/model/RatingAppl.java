package practice.reviews.model;

import practice.reviews.dao.RatingImpl;
import practice.reviews.dao.Ratings;

import java.util.*;
import java.util.stream.Collectors;

import static practice.reviews.dao.RatingImpl.calculateProductRating;
public class RatingAppl {
    //private static Ratings reviews;
    Ratings product;

    public static void main(String[] args) {
        Random random = new Random();

        List<Review> reviews = new ArrayList<>(List.of(
                new Review(1, "autnor1", "product1", "comment3", random.nextInt(10, 51)),
                new Review(2, "autnor2", "product1", "comment3", random.nextInt(10, 51)),
                new Review(4, "autnor3", "product2", "comment5", random.nextInt(10, 51)),
                new Review(5, "autnor4", "product1", "comment4", random.nextInt(10, 51)),
                new Review(5, "autnor5", "product2", "comment4", random.nextInt(10, 51)),
                new Review(5, "autnor6", "product3", "comment5", random.nextInt(10, 51)),
                new Review(4, "autnor7", "product2", "comment0", random.nextInt(10, 51)),
                new Review(2, "autnor8", "product3", "comment0", random.nextInt(10, 51)),
                new Review(2, "autnor9", "product1", "comment1", random.nextInt(10, 51)),
                new Review(1, "autnor10", "product1", "comment1", random.nextInt(10, 51))
        ));

        System.out.printf("------------List Starts---------------");
        reviews.forEach(System.out::println);
        System.out.println("================================");

        List<String> products = List.of("product1", "product2", "product3");

        Map<String, Double> productRatings = new HashMap<>();
        for (String product : products) {
            double rating = calculateProductRating(reviews, Collections.singletonList(product));
            productRatings.put(product, rating);
        }

        // Sort the products based on ratings
        List<String> sortedProducts = new ArrayList<>(productRatings.keySet());
        Collections.sort(sortedProducts, Comparator.comparingDouble(productRatings::get));

        // Print the sorted product ratings
        for (String product : sortedProducts) {
            System.out.println("Product " + product + " rating: " + productRatings.get(product));
        }


        // Сортировка списка продуктов по количеству комментариев
        Map<String, Long> productCommentCounts = reviews.stream()
                .collect(Collectors.groupingBy(Review::getProduct, Collectors.counting()));

        List<String> sortedProductsByComments = productCommentCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("=============Products  by comment count===========:");
        sortedProductsByComments
                .forEach(product -> System.out.println(product + " - " + productCommentCounts.get(product)));

        // Сортировка списка авторов по количеству лайков под их отзывами
        Map<String, Integer> authorLikeCounts = reviews.stream()
                .collect(Collectors.groupingBy(Review::getAuthor, Collectors.summingInt(Review::getLikes)));

        List<String> sortedAuthorsByLikes = authorLikeCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("===========Authors  by  likes================");
        sortedAuthorsByLikes.forEach(author -> System.out.println(author + " - " + authorLikeCounts.get(author)));



    }
    public static double calculateProductRating(List<Review> reviews, List<String> products) {
        double totalRating = 0;
        int reviewCount = 0;
        for (Review review : reviews) {
            if (products.contains(review.getProduct())) {
                totalRating += review.getRating();
                reviewCount++;
            }
        }
        return reviewCount > 0 ? totalRating / reviewCount : 0;
    }}
//метод Calculate сюда сдвинул исправлять устал и Map для сортировки AI сказал
/*public class RatingAppl {
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Review> reviews = new ArrayList<>();
        reviews.add( new Review( 1, "autnor1", "product1", "comment3", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 2, "autnor2", "product1", "comment3", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 4, "autnor3", "product2", "comment5", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 5, "autnor4", "product1", "comment4", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 5, "autnor5", "product2", "comment4", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 5, "autnor6", "product3", "comment5", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 4, "autnor7", "product2", "comment0", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 2, "autnor8", "product3", "comment0", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 2, "autnor9", "product1", "comment1", random.nextInt( 1, 11 ) ) );
        reviews.add( new Review( 1, "autnor10", "product1", "comment1", random.nextInt( 1, 11 ) ) );
        for (Review review : reviews) {
            System.out.println(review);
        }

        List<String> products = List.of("product1", "product2", "product3");
        Map<String, Double> productRatings = new HashMap<>();

        // Рассчитываем рейтинг для каждого продукта
        for (String product : products) {
            double rating = calculateProductRating( (List<Review>) reviews, product);
            productRatings.put(product, rating);
        }

        // Сортируем продукты по рейтингу
        List<String> sortedProducts = productRatings.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Выводим отсортированный список продуктов с рейтингами
        for (String product : sortedProducts) {
            double rating = productRatings.get(product);
            System.out.println("Product " + product + " rating: " + rating);
        }

        // Получение списка продуктов, отсортированных по количеству отзывов на них
        Map<String, Long> productReviewCounts = reviews.stream()
                .collect(Collectors.groupingBy(Review::getProduct, Collectors.counting()));

        List<String> productsSortedByReviewCount = productReviewCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Products sorted by review count: " + productsSortedByReviewCount);

        // Получение списка авторов, отсортированных по количеству лайков под их отзывами
        Map<String, Integer> authorLikes = new HashMap<>();
        for (Review review : reviews) {
            String author = review.getAuthor();
            int likes = authorLikes.getOrDefault(author, 0);
            likes += review.getLikes();
            authorLikes.put(author, likes);
        }

        List<String> authorsSortedByLikes = authorLikes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Authors sorted by total likes: " + authorsSortedByLikes);

    }

        }







*/
