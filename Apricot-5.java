/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// https://www.onlinegdb.com/edit/ypAiL9ucZ

import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("God bless you");
		
		String str = "KingFerdinand";
		
		// string lower case
		str = str.toLowerCase();
		System.out.println(str);
		
		// convert string to character array
        char[] charArray = str.toCharArray();
        System.out.println("Length =" + charArray.length);
        
        // convert character array to string
        String str2 = String.valueOf(charArray);
        System.out.println(str2);
        
        // string array
		String str3 = Arrays.toString(charArray);
		System.out.println(str3);
		
		
	}
}
