/*
<LeetCode 1154>
YYYY-MM-DD와 같은 양식으로 날짜가 주어지면 해당일은 1년중 몇번째 날인지 구하여라.
단 그레고리력을 사용한다.
그레고리력은 4년마다 윤년이고, 해당 년도가 100으로 나누어 떨어지면 윤년이 아니다.
단, 해당 년도가 400으로 나누어 떨어지면 윤년이다.
 */

public class A072 {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4)); // 해당년도
        int month = Integer.parseInt(date.substring(5, 7)); // 해당월
        int day = Integer.parseInt(date.substring(8, 10)); // 해당일
        int result = 0;

        for(int i = 1 ; i < month ; i++) { // 해당월 직전까지 반복
            switch(i) { // 각 달에 맞게 result에 가산
                case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
                    result += 31;
                    break;

                case 4 : case 6: case 9 : case 11 :
                    result += 30;
                    break;

                case 2: {
                    if(year % 400 == 0) // 400으로 나누어 떨어지면 윤년
                        result += 29;
                    else if(year % 4 == 0 && year % 100 != 0) // 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년
                        result += 29;
                    else // 나머지의 경우 평년
                        result += 28;

                    break;
                }
            }
        }

        result += day; // 해당일을 가산

        return result;
    }
}
