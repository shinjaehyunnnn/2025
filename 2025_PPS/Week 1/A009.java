public class A009 {
    public boolean solution(String s) {

        for(int i = 0; i < s.length(); i++) { // 문자열 길이만큼 반복하여
            if (s.charAt(i) < '0' || s.charAt(i) > '9') { // 각 문자가 0~9범위 밖이면 return false
                return false;
            }
        }

        if(s.length() != 4 && s.length() != 6) // 문자열 길이가 4도 아니고 6도 아니면 return false
            return false;

        return true; // 그 외의 경우 return true
    }
}
