/*
<프로그래머스>
양의 정수 x가 하샤드 수인지 판별하는 함수

x가 18이라면 각 자릿 수의 합은 1+8 = 9이고 18은 9로 나누어 떨어지므로 하샤드 수이고 true를 반환
x가 11이라면 각 자릿 수의 합은 1+1 = 2이고 11은 2로 나누어 떨어지지 않으므로 하샤드 수가 아니고 false를 반환
 */

class A026 {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = 0;
        String s = Integer.toString(x);
        for(int i = 0; i < s.length(); i++){ // x의 자릿수 만큼 반복하여
            temp += Integer.parseInt(s.substring(i,i+1)); // temp에 각 자릿수의 합을 구함
        }

        if(x % temp != 0) // x를 temp로 나눈 나머지가 0이 아니면 하샤드 수가 아님
            answer = false;
        return answer;
    }
}