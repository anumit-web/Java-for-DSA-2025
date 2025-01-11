
import java.util.Arrays;
import java.util.List;

public class Array3 {
    
    public static void main(String[] args) {
        System.out.println("God bless you. Happy Coding.");
        
        // Declare and initialize an integer array with 5 numbers
        int[] numbers = {10, 20, 30, 40, 50};
        
        
        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        System.out.println("Array's length: " + numbers.length);
        
        // Create an Integer array of the same length
        Integer[] integerArray = new Integer[numbers.length];

        // Convert each element from int to Integer
        for (int i = 0; i < numbers.length; i++) {
            integerArray[i] = numbers[i];            
        }
        
        List<Integer> list1 = Arrays.asList(integerArray);
        
        // Print the list
        System.out.println(list1);        // Output: [1, 2, 3, 4, 5]
        
        
    }
    
}
