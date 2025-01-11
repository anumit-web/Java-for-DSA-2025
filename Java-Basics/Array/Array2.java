
public class Array2 {
    
    public static void main(String[] args) {
        System.out.println("God bless you. Happy Coding.");
        
        // Declare and initialize an integer array with 5 numbers
        int[] numbers = {10, 20, 30, 40, 50};
        
        int[] anArray = new int[10];
        anArray[8] = 93;

        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Print the array elements
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Element (anArray) at index " + i + ": " + anArray[i]);
        }
        
        System.out.println("anArray's length: " + anArray.length);
    }
    
}
