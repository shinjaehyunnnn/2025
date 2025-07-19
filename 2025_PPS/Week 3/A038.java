/*
<LeetCode 69>
주어진 수 x에 대한 제곱근을 구한다. 만약 정수로 떨어지지 않으면 가장 가까운 내림수를 반환한다.
 */

public class A038 {
    public int mySqrt(int x) {
        if(x<2) return x; // x가 2미만인 경우 x그대로 반환

        int result = 0;

        for(int i = 1; i <= x/2 ; i++) { // x/2까지 반복 ( x/2까지만 반복해도 제곱근을 구할 수 있으므로 )
            long temp = (long)i * i; // temp는 i의 제곱
            result = i;

            if(temp > x) { // 만약 제곱한 값이 x보다 크면
                result = i-1; // 해당 i는 제곱근이 아니므로 i-1에서 끝남
                break;
            }
        }

        return result;
    }
}
