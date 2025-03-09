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
		// no fixed size


		// Creating an ArrayList of Integers for PS4 Sales
		ArrayList<Integer> sales = new ArrayList<Integer>();

		// Adding elements
		// sales of PS4 in 2020, 2021, 2022, 2023
		sales.add(7);
		sales.add(11);
		sales.add(19);
		sales.add(20);

		// Accessing elements
		System.out.println("name: " + sales.get(0)); // Output: Alice
		System.out.println("name: " + sales.get(2));

		// Inserting at specific index
		sales.add(1, 9999);
		System.out.println("Names: " + sales); // Output: [Alice, David, Bob, Charlie]

		// Removing an element
		sales.remove(3);
		System.out.println("Names after removing element at 4: " + sales); // Output: [Alice, David, Charlie]

		// Getting the size
		System.out.println("Size of ArrayList: " + sales.size()); // Output: 3

		// Checking if an element exists
		System.out.println("Contains 88? " + sales.contains(88));
		System.out.println("Contains 20? " + sales.contains(20));

		// Loop through an ArrayList
		for (int i = 0; i < sales.size(); i++) {
			System.out.println("$=" +sales.get(i));
		}

		// Sort an ArrayList
		Collections.sort(sales);  // Sort cars

		for (int i = 0; i < sales.size(); i++) {
			System.out.println("*=" + sales.get(i));
		}

	}
}
