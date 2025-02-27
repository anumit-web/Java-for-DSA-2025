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
        
        // for loop
        for (int i = 0; i < fruits1.length; i++) {
             System.out.println("" + i + ", " + fruits1[i]);
        }
        
        System.out.println("######################## Hernán Cortés");
        
        // for each
        //Loop Through an Array with For-Each
        int count = 0;
        for (String stringItem : fruits1) {
            System.out.println("" + count + ", " + stringItem);
            count = count + 1;
        }
         
        
        System.out.println("######################## Christopher Columbus");
        
        // Convert String Array to String
        System.out.println(Arrays.toString(fruits1));
        
        // convert string arrays to list
        List<String> fruitsList = Arrays.asList(fruits1); 
        
        // convert list of string to string 
        // Convert an ArrayList of String
        String[] fruits1_1 = fruitsList.toArray(new String[0]);
        
        for (int i = 0; i < fruits1_1.length; i++) {
             System.out.println("*, " + i + ", " + fruits1_1[i]);
        }
        
        
        // print list of strings
        System.out.println(Arrays.toString(fruitsList.toArray()));
        
	}
}