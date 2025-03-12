/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// https://www.onlinegdb.com/edit/wyNZ9WhTp
/*
Java HashMap
String, Integer

Java docs link =
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

Chinese mail order sorting facility photo -
https://itsupplychain.com/mini-yellow-robots-deliver-the-right-package/

*/


import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		/*
		In Java, a HashMap can store key-value pairs,
		where the keys are strings and the values are integers.
		To declare a HashMap with this configuration,
		you can use the following syntax:

		*/



		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// start of work day, initialize all bins to empty
		// these are key value pairs
		map.put("USA-Bin", 0);
		map.put("Japan-Bin", 0);
		map.put("Best-Korea-Bin", 0);
		map.put("Vietnam-Bin",0);
		map.put("HongKong-Bin", 0);

		// Input data

		String[][] binData = new String[8][2];

		binData[0][0] = "USA-Bin";
		binData[0][1] = "1";

		binData[1][0] = "HongKong-Bin";
		binData[1][1] = "2";

		binData[2][0] = "USA-Bin";
		binData[2][1] = "4";

		binData[3][0] = "Best-Korea-Bin";
		binData[3][1] = "6";

		binData[4][0] = "Vietnam-Bin";
		binData[4][1] = "2";

		binData[5][0] = "Japan-Bin";
		binData[5][1] = "2";

		binData[6][0] = "Vietnam-Bin";
		binData[6][1] = "2";

		binData[7][0] = "Laos-Bin";
		binData[7][1] = "3";



		// Iterate through rows
		for (int i = 0; i < binData.length; i++) {
			// Iterate through columns in the current row
			System.out.println("Country name = " + binData[i][0] + ", Number of packets = " + binData[i][1]);     // Move to the next line after each row
			String binName = binData[i][0];
			String numberOfPackets = binData[i][1];
			int valueToAdd = Integer.parseInt(numberOfPackets);


			if (map.containsKey(binName)) {
				// add number of packets to correct bin
				int currentValue = map.get(binName);
				int newValue = currentValue + valueToAdd;
				map.put(binName, newValue);
				System.out.println("Updated to existing Value = " + newValue);
			} else {
				map.put(binName, valueToAdd);
				System.out.println("New value added  = " + valueToAdd);

			}


		}


		// Print all values
		System.out.println(map);
	}
}

/*

Hello World
Country name = USA-Bin, Number of packets = 1
Updated to existing Value = 1
Country name = HongKong-Bin, Number of packets = 2
Updated to existing Value = 2
Country name = USA-Bin, Number of packets = 4
Updated to existing Value = 5
Country name = Best-Korea-Bin, Number of packets = 6
Updated to existing Value = 6
Country name = Vietnam-Bin, Number of packets = 2
Updated to existing Value = 2
Country name = Japan-Bin, Number of packets = 2
Updated to existing Value = 2
Country name = Vietnam-Bin, Number of packets = 2
Updated to existing Value = 4
Country name = Laos-Bin, Number of packets = 3
New value added  = 3
{USA-Bin=5, Vietnam-Bin=4, Best-Korea-Bin=6, Laos-Bin=3, Japan-Bin=2, HongKong-Bin=2}


*/