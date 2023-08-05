import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(bf.readLine())];
		for(int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(bf.readLine());
		Arrays.sort(arr);
		int exp = (int) Math.round(arr.length * 15 / 100.0);
		int sum = 0;
		for(int i = exp; i < arr.length - exp; i++)
			sum += arr[i];
		System.out.println(Math.round(sum / (arr.length - exp * 2.0)));
	}
}