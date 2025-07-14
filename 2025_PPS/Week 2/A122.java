/*
<LeetCode 796>
s 문자열을 순서대로 rotate하여 goal과 같은 문자열을 만들 수 있으면 true 만들지 못하면 flase
 */

public class A122 {
    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) { // 문자열 길이만큼 rotate를 시도
            s += s.charAt(0); // 문자열의 맨 뒤에 가장 앞자리 문자를 붙이고
            s = s.substring(1); // 맨 앞의 문자는 자르고 s에 대입

            if (goal.equals(s)) { // 만약 이번 rotate에서 goal에 도달했으면 return true
                return true;
            }
        }

        return false;
    }

}
