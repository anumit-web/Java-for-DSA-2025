

public class Strings2  {
    
  public static void main(String args[]) {
    
  String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  System.out.println("The length of the txt string is: " + txt.length());
    
String txt2 = "Hello World";
System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt2.toLowerCase());   // Outputs "hello world"

String txt3 = "Please locate where 'locate' occurs!";
System.out.println(txt3.indexOf("locate")); // Outputs 7

String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)

  }
}