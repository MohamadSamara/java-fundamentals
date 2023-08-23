package inheritance;

import java.util.HashMap;
import java.util.List;

public class Review {
    private  String body; //
    private  String author;
    private  double noStars;
    private String movie;
    protected String name;
    protected int countOfReview ;
    protected double numberOfStars ;
    protected HashMap<String, List<Object>> reviews = new HashMap<>();


    public Review(String body, String author, double noStars) {
        if(noStars > 5 || noStars < 0) {
            throw new IllegalArgumentException("Rating must be less than or equal to 5 stars");
        }
        this.body = body;
        this.author = author;
        this.noStars = noStars;
    }

    public Review(String body, String author, double noStars , String movie) {
        if(noStars > 5 || noStars < 0) {
            throw new IllegalArgumentException("Rating must be less than or equal to 5 stars");
        }
        this.body = body;
        this.author = author;
        this.noStars = noStars;
        this.movie = movie;
    }

    public Review(){
    }

    public String getBody() {
        return body;
    }
    public String getAuthor() {
        return author;
    }

    public double getStars() {
        return noStars;
    }

    public String getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        if (movie != null) {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", stars=" + noStars +
                    ", movie='" + movie + '\'' +
                    '}';
        } else {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", stars=" + noStars +
                    '}';
        }
    }
}
