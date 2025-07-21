import java.util.HashMap;

/*
<LeetCode 169>
주어진 배열의 길이가 n이면 배열에서 숫자의 개수가 n/2보다 더 많은 수를 반환하는 함수를 작성하여라
 */

public class A080 {
    public int majorityElement(int[] nums) {
        int half = nums.length / 2; // 배열길이의 반

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) { // 배열 길이만큼 반복하여서
            map.put(num, map.getOrDefault(num, 0) + 1); // map에 넣음( map에 있는 값이면 1을 추가해서 넣고, 없는 값이면 0으로 넣음 )
            if(map.get(num) > half) // 만약 해당 숫자가 map에서 half보다 더 많은 값을 가지고 있으면 반환
                return num;
        }

        return 0;
    }
}
