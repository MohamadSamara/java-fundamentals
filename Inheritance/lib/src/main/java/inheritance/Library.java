package inheritance;
public class Library {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Restaurant XXX" ,3);
        Review review1 = new Review("Great food !" , "Mohamad Samara" , 5);
        Review review2 = new Review("Good" , "Mohamad Samara2" , 3);
        restaurant1.addReview(review1);
        restaurant1.addReview(review2);

        System.out.println(review1 +"\n" + review2  +"\n" + restaurant1);

    }
}