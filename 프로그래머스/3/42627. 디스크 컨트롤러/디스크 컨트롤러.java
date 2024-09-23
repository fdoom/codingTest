import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        int total = 0;
        int time = jobs[0][0];
        int index = 0;

        while (index < jobs.length || !pq.isEmpty()) {
            while (index < jobs.length && jobs[index][0] <= time) {
                pq.add(jobs[index]);
                index++;
            }

            if (!pq.isEmpty()) {
                int[] currentJob = pq.remove();
                time += currentJob[1];
                total += time - currentJob[0];
            } else {
                time = jobs[index][0];
            }
        }

        return total / jobs.length;
    }
}
