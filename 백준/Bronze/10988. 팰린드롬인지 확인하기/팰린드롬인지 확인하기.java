import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb.toString().equals(sb.reverse().toString()) ? 1 : 0);
    }
}