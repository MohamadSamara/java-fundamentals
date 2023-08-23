package inheritance;

public class Review {
    String body;
    String author;
    double noOfStars;


    public Review(String body, String author, double noOfStars) {
        if(noOfStars > 5 || noOfStars < 0) {
            throw new IllegalArgumentException("Rating must be between [0 - 5]");
        }
        this.body = body;
        this.author = author;
        this.noOfStars = noOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", noOfStars=" + noOfStars +
                '}';
    }
}
