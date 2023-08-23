# java-fundamentals

- Lab01 : Flies --> Main.java , Main class , README.md | Methods --> pluralize(String,int) , flipNHeads(int), and clock methods

- Lab02 : Create a project with (gradle init --type java-library) with Contains roll(int n), printArray(int[] arr), containsDuplicates(int[] arr), calculatingAverages(int[] arr), and lowestAverageArray(int[][] arr).

- Lab03 : continue working in basiclibrary directory with add Methods --> AnalyzingWeatherData(int[][] arr),  maxValueInHashSet(Set<Integer> hashSetContainAllTemperatureWithoutDuplicated), minValueInHashSet(Set<Integer> hashSetContainAllTemperatureWithoutDuplicated), missingValueBetweenMAX_AND_MIN(Set<Integer> hashSetContainAllTemperatureWithoutDuplicated), print_Max_Min_MissValue(int[][] arr)

  And tally(List<String> votes), mostVoted(HashMap<String, Integer> hashMapContainAllVotes)

- lab 06 & 07 :  Restaurant Review Library

This is a Java library that provides classes for managing restaurant reviews. It includes classes for `Restaurant`, `Review`, and a set of test cases for thorough testing.

## Architecture Overview

### `Restaurant` Class
The `Restaurant` class represents a restaurant and its reviews. It has the following attributes and methods:

- `name`: The name of the restaurant.
- `numberOfStars`: The average star rating based on reviews.
- `priceCategory`: The price category of the restaurant (1 to 3).
- `countOfReview`: The total count of reviews.
- `reviews`: A HashMap associating authors with review information.

It provides the following methods:
- `Restaurant(String name, int priceCategory)`: Constructor to create a restaurant instance.
- `addReview(String body, String author, int noStars)`: Adds a review to the restaurant and updates star ratings.
- `getNumberOfStars()`: Returns the average star rating of the restaurant.
- `getPriceCategory()`: Returns the price category of the restaurant.
- `toString()`: Returns a string representation of the restaurant.

### `Review` Class
The `Review` class represents a review for a restaurant. It has the following attributes and methods:

- `body`: The content of the review.
- `author`: The author of the review.
- `noStars`: The number of stars given in the review (0 to 5).

It provides the following methods:
- `Review(String body, String author, int noStars)`: Constructor to create a review instance.
- `getStars()`: Returns the number of stars given in the review.
- `toString()`: Returns a string representation of the review.

### `LibraryTest` Class
The `LibraryTest` class contains JUnit test cases for testing the `Restaurant` and `Review` classes. It covers various scenarios, including valid and invalid inputs, constructor functionality, and the behavior of the methods in different situations.

It provides the following Test methods:


#### `testRestaurantConstructorWithValidPriceCategory`
This test method verifies that the `Restaurant` constructor correctly initializes a restaurant with a valid price category. It creates a new `Restaurant` instance and checks if the retrieved price category matches the expected value.

#### `testRestaurantConstructorWithInvalidPriceCategory`
In this test, we ensure that the `Restaurant` constructor throws an `IllegalArgumentException` when attempting to create a restaurant with an invalid price category. The test uses an assertion to verify that the expected exception is thrown.

#### `testRestaurantToString`
This test validates the `toString` method of the `Restaurant` class. It constructs a `Restaurant` instance and compares its generated string representation with the expected format.

#### `testReviewConstructorWithValidPriceCategory`
This test method confirms that the `Review` constructor correctly initializes a review with a valid star rating. It creates a new `Review` instance and checks if the retrieved star rating matches the expected value.

#### `testReviewConstructorWithInvalidPriceCategory`
Similar to the previous test, this case checks if the `Review` constructor throws an `IllegalArgumentException` when attempting to create a review with an invalid star rating. The test uses an assertion to confirm the expected exception.

#### `testReviewToString`
This test ensures that the `toString` method of the `Review` class generates the correct string representation. It constructs a `Review` instance and compares its string representation with the expected format.

#### `testRestaurantAddReview`
This test method verifies the association between a review and a restaurant using the `addReview` method. It creates a `Restaurant` instance, adds a review, and checks if the review is properly associated with the restaurant. It also verifies that the star rating of the restaurant is updated accordingly.

####  `testShopConstructor`
This test method verifies that the `Shop` constructor correctly initializes a shop instance. It creates a new `Shop` instance and checks if the retrieved attributes match the expected values.

#### `testShopAddReview`
This test method validates the `addReview` method of the `Shop` class. It creates a `Shop` instance, adds a review, and checks if the review is properly associated with the shop. It also verifies that the star rating of the shop is updated accordingly.

#### `testTheaterConstructor`
This test method ensures that the `Theater` constructor initializes a theater instance with the correct attributes. It creates a new `Theater` instance and checks if the retrieved attributes match the expected values.

#### `testTheaterAddMovie`
This test method validates the `addMovie` method of the `Theater` class. It creates a `Theater` instance, adds movies, and checks if the movies are properly associated with the theater.

#### `testTheaterAddReview`
This test method verifies the `addReview` method of the `Theater` class. It creates a `Theater` instance, adds a review with a movie, and checks if the review is properly associated with the theater. It also verifies that the star rating of the theater is updated accordingly.

#### `testTheaterAddReviewWithoutMovie`
This test method validates the `addReview` method of the `Theater` class when adding a review without specifying a movie. It creates a `Theater` instance, adds a review without a movie, and checks if the review is properly associated with the theater. It also verifies that the star rating of the theater is updated accordingly.



