package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Review implements Review2{
    private final int priceCategory;
    Review newReview;

    public Restaurant(String name, int priceCategory) {
        if (priceCategory > 3 || priceCategory < 1) {
            throw new IllegalArgumentException("Price should be in the range of [1-3].");
        }
        this.name = name;
        this.priceCategory = priceCategory;
    }

    @Override
    public void addReview(Review review) {

        String body = review.getBody();
        String author = review.getAuthor();
        double noStars = review.getStars();

        if (!reviews.containsKey(author)) {
            newReview = new Review(body, author, noStars);
            countOfReview++;
            numberOfStars = (numberOfStars + noStars) / countOfReview;
            List<Object> reviewList = new ArrayList<>();
            reviewList.add(body);
            reviewList.add(author);
            reviewList.add(noStars);
            reviews.put(author, reviewList);
            System.out.println(newReview);
        }
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    // toString
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", priceCategory=" + priceCategory +
                '}';
    }
}
