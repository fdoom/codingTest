import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] str = br.readLine().split(" ");
        int max = Arrays.stream(str).mapToInt(Integer::parseInt).max().getAsInt();
        System.out.println(Arrays.stream(str).mapToDouble(s -> Double.parseDouble(s) / max * 100.0).average().getAsDouble());
        br.close();
    }
}