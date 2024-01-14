import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>(List.of(br.readLine().split("")));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.stream().collect(Collectors.joining()));
        br.close();
    }
}