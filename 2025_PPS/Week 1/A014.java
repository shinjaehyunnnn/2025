import java.util.ArrayList;
import java.util.List;

public class A014 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) { // 배열의 길이만큼 반복해서
            int start = nums[i]; // i 인덱스의 값을 start에 저장
            while(i + 1 < nums.length && nums[i] + 1 == nums[i+1]) { // nums배열 범위내에서 i+1 인덱스의 값이 i인덱스의 값보다 1크면 i++
                i++;
            }

            String input;

            if(start != nums[i]) { // start와 nums[i]가 다르면 연속적인 숫자가 있었다는 것
                input = start + "->" + nums[i]; // 연속 숫자 문자열
            } else { // start와 nums[i]가 같으면 연속적인 숫자가 아니였음
                input = Integer.toString(start); // 단일 숫자 문자열
            }

            list.add(input);
        }

        return list;
    }
}


