package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Review implements Review2 {

    private final String name;
    private String movie;
    private final List<String> allMovies = new ArrayList<>();
    Review newReview;

    public Theater(String name) {
        this.name = name;
    }


    public void addMovie(String movie){
        if(!allMovies.contains(movie)){
            allMovies.add(movie);
        }
        else {
            System.out.println("This Movie already exist !!");
        }
    }


    public void removeMovie(String movie){
        if(allMovies.contains(movie)){
            allMovies.remove(movie);
        }
        else {
            System.out.println("This Movie dose not exist !!");
        }
    }
    @Override
    public void addReview(Review review) {
        String body = review.getBody();
        String author = review.getAuthor();
        double noStars = review.getStars();
        String movie = review.getMovie();

        if (!reviews.containsKey(author)) {
            List<Object> reviewList = new ArrayList<>();
            countOfReview++;
            if(movie == null){
                newReview = new Review(body, author, noStars);

            }else{
                newReview = new Review(body, author, noStars , movie);
                reviewList.add(movie);
            }
            numberOfStars = (numberOfStars + noStars) / countOfReview;
            reviewList.add(body);
            reviewList.add(author);
            reviewList.add(noStars);
            reviews.put(author, reviewList);
            System.out.println(newReview);
        }
    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", List of movie'" + allMovies + '\'' +
                ", numberOfStars'" + numberOfStars + '\'' +
                '}';
    }

}
