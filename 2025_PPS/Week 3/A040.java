/*
<LeetCode 1704>
주어진 문자열을 반으로 나누고 앞부분과 뒷부분의 모음 개수가 같은지 확인하는 함수를 작성하여라
 */

public class A040 {
    public boolean halvesAreAlike(String s) {
        int halflength = s.length() / 2; // 문자열 길이를 반으로 나눈 값을 구함

        int countFront = 0;
        int countBack = 0;
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for(int i = 0; i < halflength; i++) { // 문자열 길이의 반만큼 반복하여
            char front = s.charAt(i);
            char back = s.charAt(halflength + i);
            for(int j = 0; j < vowels.length; j++) { // 모음 배열과 일치하는 문자가 나오면 count증가
                if(front == vowels[j]) {
                    countFront++;
                }
                if(back == vowels[j]) {
                    countBack++;
                }
            }
        }

        if(countFront == countBack) { // 앞부분 count와 뒷부분 count가 일치하면 true
            return true;
        }

        return false;
    }
}
