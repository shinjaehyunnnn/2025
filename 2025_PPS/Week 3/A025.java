/*
<LeetCode 342>
주어진 수 n이 4의 제곱수인지 판별하는 함수를 만들어라
 */


public class A025 {
    public boolean isPowerOfFour(int n) {
        int k = n;
        while(k > 1) {
            if(k%4 == 0) // 주어진 수가 4로 나누어 떨어지면 k를 4로 나누고 반복
                k /= 4;
            else // 아닌 경우 4의 제곱수가 아님
                return false;
        }

        if(k == 1) // 처음 주어진 수가 1이거나 계속 나누는 것을 반복한 값이 1인경우
            return true;
        else
            return false;
    }
}
