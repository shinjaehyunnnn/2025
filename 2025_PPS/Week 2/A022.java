import java.util.Scanner;

/*
<백준 1267>
영식 요금제(Y)는 30초마다 10원씩 청구됨
민식 요금제(M)는 60초마다 15원씩 청구됨

통화 횟수 N을 입력받고 통화 별 시간을 입력받은 후 어떤 요금제를 선택하는 것이 더 저렴한지 출력하는 문제
 */
public class A022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumY = 0; //Y요금제를 사용했을 때 요금 합
        int sumM = 0; //M요금제를 사용했을 때 요금 합


        for(int i = 1; i <= N; i++){
            int sec = sc.nextInt();
            sumY = sumY + 10 * ((sec / 30) + 1); // 통화 시간에 따라 요금 합을 구함
            sumM = sumM + 15 * ((sec / 60) + 1);
        }

        if(sumM > sumY)
            System.out.println("Y " + sumY);
        else if(sumM < sumY)
            System.out.println("M " + sumM);
        else
            System.out.println("Y M " + sumY);
    }
}
