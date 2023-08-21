package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant{

    //Data Field
    private final String name;
    private int numberOfStars = 0;
    private final int priceCategory;
    private int countOfReview = 0;
    private final HashMap<String, List<Object>> reviews = new HashMap<String, List<Object>>();

    public Restaurant(String name, int priceCategory) {
        if (priceCategory > 3 || priceCategory < 1) {
            throw new IllegalArgumentException("Price should be in the range of [1-3].");
        }
        this.name = name;
        this.priceCategory = priceCategory;
    }


    public HashMap<String, List<Object>> addReview(String body, String author, int noStars) {

        if (!reviews.containsKey(author)) {
            countOfReview++;
            numberOfStars = (numberOfStars + noStars) / countOfReview;
            Review newReview = new Review(body, author, noStars);
            List<Object> reviewList = new ArrayList<>();
            reviewList.add(body);
            reviewList.add(author);
            reviewList.add(noStars);
            reviews.put(author, reviewList);
        }
        return reviews;
    }

    public int getNumberOfStars() {
        return numberOfStars;
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
