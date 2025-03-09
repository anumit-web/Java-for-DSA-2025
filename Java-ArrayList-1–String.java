/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		// ordered list of elements

		// Creating an ArrayList of Strings
		ArrayList<String> names = new ArrayList<>();

		// Adding elements
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		// Accessing elements
		System.out.println("First name: " + names.get(0)); // Output: Alice
		System.out.println("First name: " + names.get(2));

		// Inserting at specific index
		names.add(1, "David");
		System.out.println("Names: " + names); // Output: [Alice, David, Bob, Charlie]

		// Removing an element
		names.remove("Bob");
		System.out.println("Names after removing Bob: " + names); // Output: [Alice, David, Charlie]

		// Getting the size
		System.out.println("Size of ArrayList: " + names.size()); // Output: 3

		// Checking if an element exists
		System.out.println("Contains David? " + names.contains("David"));
	}
}
