package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant{

    //Data Field
    String name;
    int priceCategory;
    public HashMap<String, List<Object>> hashReview = new HashMap<>();

    public Restaurant(String name, int priceCategory) {
        if (priceCategory > 3 || priceCategory < 1) {
            throw new IllegalArgumentException("Price should be in the range of [1-3].");
        }
        this.name = name;
        this.priceCategory = priceCategory;
    }


    public void addReview(Review review) {
        if (!hashReview.containsKey(review.author)) {
            List<Object> revDetails = new ArrayList<>();
            revDetails.add(review.body);
            revDetails.add(review.noOfStars);
            hashReview.put(review.author, revDetails);
        }
    }

    public double getAverageRating() {
        if (hashReview.isEmpty()) {
            return 0;
        }

        double totalRating = 0;
        for (List<Object> revDetails : hashReview.values()) {
            double noOfStars = (double) revDetails.get(1);
            totalRating += noOfStars;
        }

        return totalRating / hashReview.size();
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + getAverageRating() +
                ", priceCategory=" + priceCategory +
                '}';
    }

}
