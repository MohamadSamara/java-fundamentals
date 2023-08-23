package inheritance;

public class Library {
    public static void main(String[] args) {

        System.out.println("========START WITH RESTAURANT========");

        Restaurant restaurant1 = new Restaurant("My Restaurant", 3);

        System.out.println("Before Add Review: " + restaurant1);

        restaurant1.addReview(new Review("Nice !" , "Mohamad" ,5.));
        restaurant1.addReview(new Review("Nice !" , "Samara" ,1));

        System.out.println("After Add 2 Review: " +restaurant1);
        System.out.println("========END FROM RESTAURANT========");

        System.out.println("========START WITH SHOP========");

        Shop shop = new Shop("Shop X","Nice Shop",3);

        System.out.println("Before Add Review: " + shop);

        shop.addReview(new Review("Nice !" , "Mohamad" ,5));
        shop.addReview(new Review("Nice !" , "Samara" ,1));

        System.out.println("After Add 2 Review: " +shop);

        System.out.println("========END FROM SHOP========");

        System.out.println("========START WITH THEATER========");

        Theater theater1 = new Theater("Theater X" );
        System.out.println("Before Add Review: " + theater1);

        theater1.addMovie("Movie 1");
        theater1.addMovie("Movie 2");
        theater1.addMovie("Movie 3");
        theater1.addReview(new Review("Good !","Mohamad",4 , "My Movie"));
        theater1.addReview(new Review("Great !","Samara",5));

        System.out.println("After Add 2 Review: " +theater1);


        System.out.println("========END FROM THEATER========");
        theater1.removeMovie("Movie 3");
        System.out.println("Here I will remove Movie 3 : " + theater1);
// =============================================================================

            }
        }
