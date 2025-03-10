/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Country food
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		HashMap<String, String> countryFood = new HashMap<String, String>();

		// Key value pairs
		// Add keys and values (Country, City)
		countryFood.put("Italy", "Pizza");
		countryFood.put("Japan", "Ramen");
		countryFood.put("Malaysia", "Nasi Lemak");
		countryFood.put("USA", "Hamburger");
		countryFood.put("Canada", "Tim Hortons");
		System.out.println(countryFood);

		// Access an Item
		System.out.println("*="+countryFood.get("Japan"));


		// Remove an Item
		System.out.println("-/-"+ countryFood.remove("China"));
		System.out.println("-/-"+ countryFood.remove("Japan"));

		// HashMap Size
		System.out.println("o:o ="+ countryFood.size());

		// Loop Through a HashMap
		for (String item : countryFood.keySet()) {
			System.out.println(".-----. = " + item);
		}


		// Print keys and values
		for (String item : countryFood.keySet()) {
			System.out.println("key = " + item + "; it's value = " + countryFood.get(item));
		}

		// remove all items from HashMap
		System.out.println("^^^ = "+countryFood.size());
		countryFood.clear();
		System.out.println("^^^ = "+countryFood.size());


	}
}
