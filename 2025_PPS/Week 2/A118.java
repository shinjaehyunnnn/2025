/*
<LeetCode 283>
정수 배열 nums가 주어지면 0이 아닌 요소들은 순서를 유지하면서 모든 0을 배열 맨끝으로 이동시킨다.
 */

public class A118 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) { // 배열을 전체 확인하여
            int temp = nums[i];
            if(temp != 0) { // 만약 0이 아니면
                nums[index++] = temp; // 배열의 처음부터 순서대로 대입
            }
        }

        while(index < nums.length) { // 0이 아닌 요소들의 대입이 끝나고 나머지는 0으로 채움
            nums[index++] = 0;
        }
    }
}
