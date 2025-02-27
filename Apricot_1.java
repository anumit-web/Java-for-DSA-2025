/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in .this editor and press "Debug" button to debug program.

*******************************************************************************/

// https://www.onlinegdb.com/online_java_debugger#

import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		
		System.out.println("Welcome to Online IDE!! Happy Coding :)");
		
        String[] fruits1 = {"grapes", "apricot", "strawberry", "cranberry", "kiwi"};
        
        String[] fruits2 = new String[3];
        
        // print an array elemnt
        System.out.println(fruits1[2]);
        
        // change an array element
        fruits1[2] = "pineapple";
        System.out.println(fruits1[2]);
        
        for (int i = 0; i < fruits1.length; i++) {
             System.out.println("" + i + ", " + fruits1[i]);
        }
        
        // Convert String Array to String
        System.out.println(Arrays.toString(fruits1));
        
        // convert string arrays to list
        List<String> fruitsList = Arrays.asList(fruits1); 
        
        
	}
}