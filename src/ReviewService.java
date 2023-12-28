import java.util.ArrayList;
import java.util.Collections;

class ReviewService {
    private ArrayList<Review> reviews;

    public ReviewService() {
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);

    }

    public void getProductReviews(int productId) {
        // Implementation for getting reviews for a product
        ArrayList<Review> productReviews = new ArrayList<>();
        for (Review review : reviews) {
            if (review.getProductId() == productId) {
                productReviews.add(review);
            }
        }
        for (Review review : productReviews) {
            review.toString();
        }
    }

    public void getAllReviews() {
        for (Review review : reviews) {
            System.out.println(review.toString());
        }
    }


}
