import java.util.Scanner;

/*
여러개의 문을 통과해야 나갈 수 있는 방에 갇혀있다.
문을 여는 규칙은 다음과 같다.
규칙 1 : 여는 방법은 밀어 여는 방법과 당겨서 여는 방법이 있다.
규칙 2 : 두 번 연속 같은 방법으로 열 수 없다.
규칙 3 : 2의 배수번째 문들은 같은 방법으로 열어야 한다.
규칙 4 : 3의 배수번째 문들은 같은 방법으로 열어야 한다.

첫째 줄에 문의 개수를 입력받고, 둘째 줄에 첫 번째 문을 통과할 때 사용한 방법을 입력받는다.
두 번째 문부터 문을 여는 방법을 출력하고, 만약 탈출이 불가능하면 Love is open door를 출력한다.
 */

/*
2의 배수끼리 같은 방법 3의 배수끼리 같은 방법을 사용해야하는데 두번 연속 같은 방법을 사용하지 못하므로
6번째 문부터는 열 수 있는 방법이 없다.
 */


public class A029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // 문의 개수
        int k = sc.nextInt(); // 첫 번째 문을 통과할 때 사용한 방법
        int[] a = new int[6]; // 여는 방법을 저장할 배열
        a[0] = k; // 첫 번째 문을 통과할 때 사용한 방법을 저장

        if(n > 5) // 문의 개수가 6개 이상이면 열 수 없음
            System.out.println("Love is open door");
        else { // 6개 미만이라면 배열에 문을 여는 방법 저장 후 출력
            for(int i = 1; i < n; i++) {
                if(a[i - 1] == 0) // 직전 단계에서 사용한 방법이 0이었다면 다음 사용한 것은 1
                    a[i] = 1;
                else if(a[i - 1] == 1) // 직전 단계에서 사용한 방법이 1이었다면 다음 사용한 것은 0
                    a[i] = 0;
            }
            for(int i = 1; i < n; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
