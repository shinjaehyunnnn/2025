/*
<LeetCode 844>
주어진 문자열 s와 t가 있다.
문자열에서 #은 backspace를 의미한다. 문자열 s와 t가 #문자를 처리한 결과가 같은지 비교하는 함수를 작성하여라.
 */

public class A042 {
    public boolean backspaceCompare(String s, String t){
        int sLen = s.length(); // s문자열의 길이
        int tLen = t.length(); // t문자열의 길이
        StringBuilder sResult = new StringBuilder();
        StringBuilder tResult = new StringBuilder();

        for(int i = 0; i < sLen; i++){
            if(s.charAt(i) == '#' && !sResult.toString().isEmpty()) // s의 i번째 문자가 #이고 StringBuilder가 empty상태가 아니라면
                sResult.deleteCharAt(sResult.length()-1); // StringBuilder 마지막 인덱스 문자를 지움
            else if(s.charAt(i) != '#') // s의 i번째 문자가 #이 아닌 경우
                sResult.append(s.charAt(i)); // StringBuilder에 덧붙임
        }

        for(int i = 0; i < tLen; i++){
            if(t.charAt(i) == '#' && !tResult.toString().isEmpty())
                tResult.deleteCharAt(tResult.length()-1);
            else if(t.charAt(i) != '#')
                tResult.append(t.charAt(i));
        }

        if(sResult.toString().equals(tResult.toString())) // 완성된 StringBuilder끼리 비교하여 일치하면 true
            return true;

        return false;
    }
}
