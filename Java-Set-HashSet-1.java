/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// https://www.onlinegdb.com/edit/2jmG8Azn7X

import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello Smith");

		// Java Set is a collection of elements that contains no duplicate elements
		// Java Set is an interface that extends Collection interface
		// Java Set is NOT an ordered collection
		// You cannot access elements by their index

		// HashSet

		// >>> add items

		HashSet<String> iceCreamFlavors = new HashSet<String>();
		// Add elements to the HashSet
		boolean added = false;
		added = iceCreamFlavors.add("Rum raisin");
		added = iceCreamFlavors.add("Strawberry");
		added = iceCreamFlavors.add("Vanilla");
		added = iceCreamFlavors.add("Chocolate"); // Adding a duplicate

		// >>> print items

		// Method 1: Using System.out.println() directly
		System.out.println("HashSet (Method 1): " + iceCreamFlavors);

		// >>> find number of elements in the Set

		System.out.println("Size = " + iceCreamFlavors.size()) ;

		// >>> find if Set is empty or not.

		System.out.println("No elements or elements present? empty or full?= " + iceCreamFlavors.isEmpty()) ;

		// >>> find if Set is empty or not.

		System.out.println("Contains flavor = " + iceCreamFlavors.contains("Green Tea")) ;
		System.out.println("Contains flavor = " + iceCreamFlavors.contains("Rum raisin")) ;

		// >>> Convert hahset to array

		// Convert HashSet to String array
		String[] stringArrayIceCream = iceCreamFlavors.toArray(new String[0]);
		System.out.println("Length = " + stringArrayIceCream.length);

		// >>> clone HashSet
		HashSet<String> clonedSet = new HashSet<String>(iceCreamFlavors);
		System.out.println("Cloned set size  = " + clonedSet.size());

		// >>> remove element from Set
		boolean removeResult = false;
		removeResult = iceCreamFlavors.remove("Cherry");
		System.out.println("Remove result =" + removeResult);
		removeResult = iceCreamFlavors.remove("Chocolate");
		System.out.println("Remove result =" + removeResult);


		// >>> Loop through a Set / HashSet
		// Method 1: Using a for-each loop (enhanced for loop)
		System.out.println("Method 1: For-each loop");
		for (String itemIceCreamFlavor : iceCreamFlavors) {
			System.out.println(itemIceCreamFlavor);
		}

		// >>> Remove all items of a Set, clear set
		System.out.println("Set before clear(): " + iceCreamFlavors);

		// Clear the set
		iceCreamFlavors.clear();
		System.out.println("Set after clear(): " + iceCreamFlavors);
		System.out.println("Is the set empty? " + iceCreamFlavors.isEmpty());



	}
}
