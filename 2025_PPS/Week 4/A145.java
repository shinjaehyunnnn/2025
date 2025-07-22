/*
<programmers - 부족한 금액 계산하기>
놀이기구의 이용료는 price이고 놀이기구를 N번 째 이용하면 원래 이용료의 N배를 받는다.
즉, 처음 이용료가 100이면 2번째 이용시 200, 3번째 이용시 300이다.
놀이기구를 count번 타면 현재 자신이 가지고 있는 money에서 얼마가 모자란지 return하는 함수를 작성하여라.
만약 금액이 모자르지 않으면 0을 return한다.
 */


public class A145 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long totalPrice = 0; // 누적 이용료
        for(int i = 0 ; i < count ; i++) { // 놀이기구 탑승횟수만큼 반복
            totalPrice += price*(i+1); // 누적 이용료에 탑승횟수만큼 곱하여 가산
        }

        answer = money - totalPrice;
        if(answer < 0) // 만약 누적이용료를 지불하면 잔액이 마이너스일 경우
            answer *= -1; // 부족한 금액을 answer에 대입
        else // 부족하지 않으면
            answer = 0; // 0을 대입

        return answer;
    }
}
