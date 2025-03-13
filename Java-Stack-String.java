/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


// https://www.onlinegdb.com/edit/4stqdSBjT

import java.util.Stack;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		Stack<String> animals= new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		System.out.println("Stack: " + animals);

		// Remove element stacks
		String element = animals.pop();
		System.out.println("\\+++ = Removed Element: " + element);
		System.out.println("\\+++ = Stack: " + animals);


		// Access element from the top
		String topElement = animals.peek();
		System.out.println("%%#: = Element at top: " + topElement);
		System.out.println("%%#: = Stack: " + animals);

		// Check if stack is empty
		boolean result = animals.empty();
		System.out.println("^>^> = Is the stack empty? " + result);

		// you should use a while loop to iterate over all elements
		while(!animals.empty()) {
			String valueofItem = animals.pop();
			System.out.println("*~ = " + valueofItem);
		}

	}
}
