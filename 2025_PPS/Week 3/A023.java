/*
<LeetCode 258>
주어진 수 num의 각 자리수를 더하고 더한 값이 한자리 수가 될 때까지 각 자리수를 더하는 것을 반복한다.
반복하여 구해진 한자리 수를 반환하여라
 */

public class A023 {
    public int addDigits(int num) {
        while(num > 9) {
            int sum = 0;
            String tempStr = Integer.toString(num);
            for(int i = 0 ; i < tempStr.length() ; i++) {
                sum += Integer.parseInt(tempStr.charAt(i) + "");
            }
            num = sum;
        }

        return num;
    }
}
