import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[] operations = new int[4];
    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++)
            operations[i] = Integer.parseInt(st.nextToken());

        if(list.size() == 1) {
            maxValue = list.get(0);
            minValue = list.get(0);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operations[i] > 0)
                    DFS(i, 1, list.get(0));
            }
        }

        System.out.println(maxValue + "\n" + minValue);
    }

    static void DFS(int choice, int currentDepth, int sum) {
        int temp = sum;
        switch (choice) {
            case 0: temp += list.get(currentDepth); break;
            case 1: temp -= list.get(currentDepth); break;
            case 2: temp *= list.get(currentDepth); break;
            default: temp /= list.get(currentDepth); break;
        }

        if(currentDepth == list.size() - 1)  {
            maxValue = Math.max(temp, maxValue);
            minValue = Math.min(temp, minValue);
            return;
        }

        operations[choice]--;
        for(int i = 0; i < 4; i++)
            if(operations[i] > 0)
                DFS(i, currentDepth + 1, temp);
        operations[choice]++;
    }
}