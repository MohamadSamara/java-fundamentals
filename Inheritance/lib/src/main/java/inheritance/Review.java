package inheritance;

public class Review {
    private final String body;
    private final String author;
    private final int noStars;


    public Review(String body, String author, int noStars) {
        if(noStars > 5 || noStars < 0) {
            throw new IllegalArgumentException("Rating must be less than or equal to 5 stars");
        }
        this.body = body;
        this.author = author;
        this.noStars = noStars;
    }


//    public String getBody() {
//        return body;
//    }

//    public void setBody(String body) {
//        this.body = body;
//    }


//    public String getAuthor() {
//        return author;
//    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
    public int getStars() {
        return noStars;
    }
//    public void setStars(int stars) {
//        this.noStars = stars;
//    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + noStars +
                '}';
    }
}
