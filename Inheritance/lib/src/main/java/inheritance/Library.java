package inheritance;

public class Library {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("My Restaurant", 3);

        System.out.println("Before Add Review: " + restaurant1);

        restaurant1.addReview("Nice !", "Mohamad", 5);
        restaurant1.addReview("Great food !", "Mohamad", 3);
        restaurant1.addReview("Deciles !", "Ahmad", 3);

        System.out.println("After Add 2 Review: " +restaurant1);
    }
}
