/*
<LeetCode 860>
레몬에이드 한잔의 가격은 5달러이다.
배열에 고객이 레몬에이드를 한잔씩 구매하고 지불한 금액이 나열되어있다.
처음에 보유하고있던 금액이 0원이라 가정하고 배열 순서대로 고객이 레몬에이드를 구매했다고 가정하였을 때
거스름돈을 반환할 수 있으면 true를 반환하고 반환할 수 없으면 false를 반환한다.
 */

public class A024 {
    public boolean lemonadeChange(int[] bills) {
        int count5  = 0; // 초기 보유 잔액
        int count10 = 0;
        int count20 = 0;

        for(int i = 0; i < bills.length; i++) { // 배열의 길이만큼 반복
            if(bills[i] == 5) // 고객이 5달러를 지불할 경우
                count5++; // 5달러 잔액 증가
            else if(bills[i] == 10) { // 고객이 10달러를 지불할 경우
                count10++; // 10달러 잔액 증가
                count5--; // 5달러를 거슬러줌
            } else if(bills[i] == 20) { // 고객이 20달러를 지불할 경우
                if(count10 == 0) { // 만약 10달러를 거슬러줄수없는 상황이라면
                    count20++; // 20달러 잔액 증가
                    count5 -= 3; // 5달러를 3번 거슬러줌
                }
                else { // 10달러 잔액이 있는 상태라면
                    count20++; // 20달러 잔액 증가
                    count10--; // 10달러 1장과
                    count5--; // 5달러 1장을 거슬러줌
                }
            }

            if(count5 < 0 || count10 < 0 || count20 < 0) // 반복마다 잔액이 마이너스가 되는 경우가 있으면 해당 손님에게 못거슬러준 상황
                return false;

        }
        return true;
    }
}
