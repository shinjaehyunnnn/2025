import java.util.Scanner;

public class A110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt(); // 상품의 가격
        int pay = 1000; // 지불한 금액 ( 1000엔 고정 )
        int count = 0; // 거스름돈의 개수 세기

        while(pay - cost > 0) { // 더이상 거스름돈을 줄 수 없을 때 까지
            if(pay - cost >= 500) { // 500엔을 거슬러 줄 수 있는 경우
                pay -= 500;
                count++;
            } else if(pay - cost >= 100) { // 100엔을 거슬러 줄 수 있는 경우
                pay -= 100;
                count++;
            } else if(pay - cost >= 50) { // 50엔을 거슬러 줄 수 있는 경우
                pay -= 50;
                count++;
            } else if(pay - cost >= 10) { // 10엔을 거슬러 줄 수 있는 경우
                pay -= 10;
                count++;
            } else if(pay - cost >= 5) { // 5엔을 거슬러 줄 수 있는 경우
                pay -= 5;
                count++;
            } else if(pay - cost >= 1) { // 1엔을 거슬러 줄 수 있는 경우
                pay -= 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
