import java.util.*;
class Solution {
    static Set<List<Integer>> set = new HashSet<>();
    
    public int solution(int[] numbers, int target) {
        List<Integer> list = new ArrayList<>();
        DFS(numbers, target, 0, 0, list);
        return set.size();
    }
    
    public static void DFS(int[] numbers, int target, int sum, int deep, List<Integer> list) {
        if (deep == numbers.length) {
            if (sum == target) {
                set.add(list);
            }
            return;
        }

        list.add(numbers[deep]);
        DFS(numbers, target, sum + numbers[deep], deep + 1, list);
        list.remove(deep);

        list.add(numbers[deep] * -1);
        DFS(numbers, target, sum - numbers[deep], deep + 1, list);
        list.remove(deep);
    }
}