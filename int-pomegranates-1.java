/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		System.out.println("Hello");

		int a = 1000;
		int b = -500;
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		
		int x = 10;
        int y = 20;
        int sum = x + y;
        int product = x * y;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        int[] intArray = {1, 2, 3, 4, 5};
        for (int item : intArray) {
            System.out.println(item);
        }
        for( int i=0;i<intArray.length;i++) {
            System.out.println("#=" + intArray[i]);
        }
            
	}
}
