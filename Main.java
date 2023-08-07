import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        // int catCount = 2;
        // int turtleCount = 0;

        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + "."); // output :I own 1 dog.
        // System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + "."); // output :I own 2 cats.
        // System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + "."); // output :I own 0 turtles.

        flipNHeads(1);
        // flipNHeads(2);

        clock();
    }

    // pluralize Function
    public static String pluralize(String word, int number) {

        if (number == 0 || number > 1) {
            return (word + "s");
        } else {
            return word;
        }
    }

    // flipNHeads Function
    public static void flipNHeads(int n) {
        int countFlips = 0;
        int countHead = 0;
        Random random = new Random();

        while (countHead < n) {

            double randomNum = random.nextDouble();
            countFlips++;
            if (randomNum >= 0.5) {
                System.out.println("Head");
                countHead++;
            } else {
                System.out.println("tails");
                countHead = 0;
            }
        }

        System.out.println("It took " + countFlips + " flips to flip " + n + " head(s) in a row.");
    }


    // clock Function
   
    public static void clock() {
        String firstTime = "" ;
        int million = 1_000_000;
        double counter = 0;

        while(true){
            counter++;
            LocalDateTime now = LocalDateTime.now();
            String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(!currentTime.equals(firstTime)){
                firstTime = currentTime;
                System.out.println(firstTime + " " + counter/million +" MHz" );
                counter = 0;
            }
        }
    } 


}