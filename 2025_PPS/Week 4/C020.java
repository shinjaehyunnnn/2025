/*
<LeetCode 13>
로마숫자를 정수형태로 반환하는 함수를 작성하여라.

I             1
V             5
X             10
L             50
C             100
D             500
M             1000

이고,
I가 V와 X 앞에 오면 각각 4와 9를 나타낸다.
X가 L과 C 앞에 오면 각각 40 90을 나타낸다.
C가 D와 M 앞에 오면 각각 400 900을 나타낸다.
 */


public class C020 {
    public int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {

            char next = (i + 1 < s.length()) ? s.charAt(i + 1) : ' '; // i+1이 주어진 문자열 길이 범위 안이면 i+1번째 자리 문자를, 넘어가면 공백을

            switch(s.charAt(i)) { //문자별로 판별하되 I,X,C의 경우는 다음 문자에 따라 값을 다르게 함
                case 'I':
                    if(next == 'V') {
                        result += 4;
                        i++;
                    } else if(next == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;

                case 'V':
                    result += 5;
                    break;

                case 'X':
                    if(next == 'L') {
                        result += 40;
                        i++;
                    } else if(next == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                    break;

                case 'L':
                    result += 50;
                    break;

                case 'C':
                    if(next == 'D') {
                        result += 400;
                        i++;
                    } else if(next == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;

                case 'D':
                    result += 500;
                    break;

                case 'M':
                    result += 1000;
                    break;
            }
        }

        return result;
    }
}

