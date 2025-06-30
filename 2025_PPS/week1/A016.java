import java.util.Arrays;

public class A016 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 오름차순으로 정렬
        int answer = 0; // 보트의 개수
        int heavy = people.length - 1; // 무거운 사람 index
        int light = 0; // 가벼운 사람 index

        while (light <= heavy) { // 모든 사람이 탈 때까지
            if (people[light] + people[heavy] <= limit) { // 남은 사람중 가장 가벼운 사람과 무거운 사람의 합이 한계 이하이면
                light++; // 가벼운 사람도 같이 타고감
            }
            heavy--; // 무거운 사람은 혼자이던 두명이던 무조건 타고감
            answer++;
        }

        return answer;
    }
}

