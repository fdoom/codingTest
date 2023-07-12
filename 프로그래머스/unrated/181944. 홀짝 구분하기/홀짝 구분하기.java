import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = { n + " is even", n + " is odd"};
        System.out.println((n % 2 == 0) ? s[0] : s[1]);
    }
}