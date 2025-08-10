package util;

import java.util.*;

/*
 * ======================================
 * Java Scanner Methods - Notes
 * ======================================
 *
 * 1. next()
 *    - Reads the next token (word) from input.
 *    - Tokens are separated by spaces, tabs, or newlines.
 *    - Stops reading right before whitespace.
 *    - Does NOT include the newline character in the result.
 *
 *    Example:
 *      Scanner sc = new Scanner(System.in);
 *      String word = sc.next();
 *    Input:  hello world
 *    Output: word = "hello"
 *
 * ------------------------------------------------
 *
 * 2. nextLine()
 *    - Reads the entire line (including spaces) until newline (\n).
 *    - Consumes the newline at the end.
 *    - Useful for reading a full sentence or text with spaces.
 *
 *    Example:
 *      String line = sc.nextLine();
 *    Input:  hello world
 *    Output: line = "hello world"
 *
 * ------------------------------------------------
 *
 * 3. nextInt()
 *    - Reads the next integer from input.
 *    - Skips leading whitespace.
 *    - Stops before the first non-digit.
 *    - Leaves the newline in the buffer (can cause issues if followed by nextLine()).
 *
 *    Example:
 *      int num = sc.nextInt();
 *    Input:  42 abc
 *    Output: num = 42
 *    Buffer after reading: " abc"
 *
 * ------------------------------------------------
 *
 * 4. nextDouble()
 *    - Reads the next double (floating-point number) from input.
 *    - Similar behavior to nextInt(), but supports decimal points.
 *
 *    Example:
 *      double d = sc.nextDouble();
 *    Input:  3.14 pi
 *    Output: d = 3.14
 *
 * ------------------------------------------------
 *
 * 5. nextLong()
 *    - Reads the next long integer from input.
 *    - Works like nextInt() but for larger integer values.
 *
 *    Example:
 *      long big = sc.nextLong();
 *    Input:  123456789
 *    Output: big = 123456789
 *
 * ------------------------------------------------
 *
 * 6. Reading a single character
 *    - No direct method in Scanner for char.
 *    - Use next().charAt(0) to get the first character of the next token.
 *
 *    Example:
 *      char c = sc.next().charAt(0);
 *    Input:  a b
 *    Output: c = 'a'
 *
 * ------------------------------------------------
 *
 * ⚠ Common Pitfall: Mixing nextInt()/nextDouble()/nextLong() with nextLine()
 *    - After reading a number, the newline remains in the buffer.
 *    - If you call nextLine() right after, it will read that leftover newline (resulting in an empty string).
 *
 *    Example Problem:
 *      int age = sc.nextInt();
 *      String name = sc.nextLine(); // Reads leftover newline!
 *
 *    Fix:
 *      int age = sc.nextInt();
 *      sc.nextLine(); // consume leftover newline
 *      String name = sc.nextLine(); // now reads actual input
 */

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. next()
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println("Word: " + word);

        sc.nextLine(); // clear newline from buffer

        // 2. nextLine()
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Sentence: " + sentence);

        // 3. nextInt()
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Integer: " + num);

        // 4. nextDouble()
        System.out.print("Enter a decimal: ");
        double d = sc.nextDouble();
        System.out.println("Double: " + d);

        // 5. nextLong()
        System.out.print("Enter a long number: ");
        long bigNum = sc.nextLong();
        System.out.println("Long: " + bigNum);

        // 6. char input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character: " + ch);

        sc.close();
    }
}
