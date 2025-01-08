
public class CharDemo1 {
    public static void main(String[] args) {
        char ch = 'a';
        char upperCh = Character.toUpperCase(ch);

        System.out.println("Original: " + ch);       // Output: a
        System.out.println("Uppercase: " + upperCh); // Output: A
    }
}