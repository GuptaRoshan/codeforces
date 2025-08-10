package dp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnotherBrokenKeyboard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();
        char[] available = new char[k];

        for (int i = 0; i < k; i++) {
            available[i] = scanner.next().charAt(0);
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set.add(available[i]);
        }

        long result = 0;
        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                count = 0;
                continue;
            }
            count++;
            result += count;
        }

        System.out.println(result);
    }

}
