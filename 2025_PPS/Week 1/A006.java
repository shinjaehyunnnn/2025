class A006 {
    boolean solution(String s) {
        boolean answer = true;

        int countP = 0; // p의 개수
        int countY = 0; // y의 개수
        String temp = s.toLowerCase(); // 대소문자 구분없이 확인하기 위해 소문자로 변환

        for(int i = 0; i < s.length(); i++){ // 문자열 길이만큼 반복하여
            if(temp.charAt(i) == 'p') // p일 경우 countP 증가
                countP++;

            if(temp.charAt(i) == 'y') // y일 경우 countY 증가
                countY++;
        }

        if(countP != countY) // P와 Y count가 불일치하면 false
            answer = false;

        return answer;
    }
}
