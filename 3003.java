import java.util.*;

class Main {
    public static void main(String[] args){
		final int[] chess = {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);

        int input;
        for(int num : chess){
            input = sc.nextInt();
            System.out.print(num - input + " ");
        }
        sc.close();
    }
}