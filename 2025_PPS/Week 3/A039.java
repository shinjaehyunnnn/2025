/*
<LeetCode 367>
sqrt를 사용하지 않고 주어진 숫자의 넓이의 사각형이 변이 정수인 정사각형인지 판별하여라
 */

public class A039 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if(square == num) { // mid제곱이 num이면 그대로 종료
                return true;
            } else if(square > num) { // mid제곱 결과가 num보다 크면 right를 줄여서 다시 mid를 찾음
                right = mid - 1;
            } else { // mid제곱의 결과가 num보다 작으면 left를 늘려 다시 mid를 찾음
                left = mid + 1;
            }
        }
        return false;
    }
}
