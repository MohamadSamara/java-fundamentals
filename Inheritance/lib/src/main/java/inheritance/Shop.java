package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shop extends Review implements Review2  {
    private final String name;
    private String description;
    private final int noOfDollarSigns;
    Review newReview;

    public Shop(String name, String description, int noOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.noOfDollarSigns = noOfDollarSigns;
    }

    public void addReview(Review review) {

        String body = review.getBody();
        String author = review.getAuthor();
        double noStars = review.getStars();

        if (!super.reviews.containsKey(author)) {
            countOfReview++;
             newReview = new Review(body, author, noStars);
            numberOfStars = (numberOfStars + noStars) / countOfReview;
            List<Object> reviewList = new ArrayList<>();
            reviewList.add(body);
            reviewList.add(author);
            reviewList.add(noStars);
            reviews.put(author, reviewList);
        }
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", noOfDollarSigns=" + noOfDollarSigns +
                '}';
    }
}

