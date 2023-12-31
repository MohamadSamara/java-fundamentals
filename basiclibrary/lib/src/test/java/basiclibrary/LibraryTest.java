/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void testRollGenerateArrayWithRightLength(){
        // 1 Arrange
        // system under test
        Library sut = new Library();
        //Act
        int[] result = sut.roll(5);
        //Assert
        Assertions.assertEquals(5 , result.length);
    }

    @Test void testContainsDuplicates_returnTrueIfThereIsDuplicates(){
        // 1 Arrange
        // system under test
        Library sut = new Library();
        //Act
        int[] arr1 = {1, 2, 3, 4, 1};
        int[] arr2 = {1, 2, 3, 4};
        boolean result1 = sut.containsDuplicates(arr1);
        boolean result2 = sut.containsDuplicates(arr2);

        //Assert
        Assertions.assertEquals(true,result1);
        Assertions.assertEquals(false,result2);
    }

    @Test void testCalculatingAverages(){
        // 1 Arrange
        // system under test
        Library sut = new Library();
        //Act
        int[] arr = {1, 2, 3};
        double result = sut.calculatingAverages(arr);

        //Assert
        Assertions.assertEquals(2,result);
    }

    @Test void testLowestAverageArray(){
        // 1 Arrange
        // system under test
        Library sut = new Library();
        //Act
        int[][] arr = {
                {1, 2, 3, 4 ,5},
                {3, 4, 5, 6, 7},
                {5, 6, 7, 8, 9}
        };
         int[] result = sut.lowestAverageArray(arr);

        //Assert
        Assertions.assertEquals(arr[0],result);
    }

//=======================================Test For Lab03==================================================================================


    // =========First Function=================
    @Test void print_Max_Min_MissValue(){
        // 1 Arrange
        // system under test
        Library sut = new Library();
        //Act
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[][] empty = {};
        int[][] oneElement = {{1}};
        String result = sut.print_Max_Min_MissValue(weeklyMonthTemperatures);
        String result2 = sut.print_Max_Min_MissValue(empty);
        String result3 = sut.print_Max_Min_MissValue(oneElement);

        //Assert
        Assertions.assertEquals("High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n",result);

        Assertions.assertEquals("Empty Array!!" , result2);
        Assertions.assertEquals("there is one Temperature : " + oneElement[0][0] , result3);

    }


    // =========Second Function=================

    @Test void tally(){
        // 1 Arrange
        // system under test
        Library sut = new Library();

        //Act
        List<String> votes1 = new ArrayList<>();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String result = sut.tally(votes);
        String result1 = sut.tally(votes1); // Empty List
        //Assert
        Assertions.assertEquals("Bush",result);
        Assertions.assertEquals("The List is Empty !!!",result1);

    }

}
