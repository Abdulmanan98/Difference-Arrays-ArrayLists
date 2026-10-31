
import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {

        // ARRAY EXAMPLE
        // An array has a fixed size after it is created.
        // It can store primitive values such as int directly.
        int[] scores = {85, 90, 78, 95, 88};

        System.out.println("=== Array Example ===");

        // Access an array element using its index.
        // Indexes begin at 0.
        System.out.println("First score: " + scores[0]);

        // Arrays use the length property to show their size.
        System.out.println("Array length: " + scores.length);


        // ARRAYLIST EXAMPLE
        // An ArrayList can grow or shrink as elements change.
        // Integer is used because ArrayList stores objects,
        // rather than primitive int values directly.
        ArrayList<Integer> scoreList = new ArrayList<>();

        System.out.println("\n=== ArrayList Example ===");

        // Add elements with the add() method.
        scoreList.add(85);
        scoreList.add(90);
        scoreList.add(78);

        // Access an ArrayList element using get().
        System.out.println("First score: " + scoreList.get(0));

        // ArrayLists use size() to show the number of elements.
        System.out.println("ArrayList size: " + scoreList.size());

        // Add an element without creating a new collection.
        scoreList.add(95);
        System.out.println("After adding a score: " + scoreList);

        // Remove the element at index 1.
        scoreList.remove(1);
        System.out.println("After removing an element: " + scoreList);


        // COMPARE THE TWO DATA STRUCTURES
        System.out.println("\n=== Comparison ===");
        System.out.println("Array length: " + scores.length);
        System.out.println("ArrayList size: " + scoreList.size());
    }
}   
