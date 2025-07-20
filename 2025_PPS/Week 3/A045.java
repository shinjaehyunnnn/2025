import java.util.Scanner;

/*
<백준 1157>
알파벳 대소문자로 구성된 문자열을 입력받고 가장 많이 사용된 알파벳을 출력하는 프로그램을 작성하여라.
대소문자를 구분하지 않으며 결과는 대문자로 출력한다.
가장 많이 사용된 알파벳이 여러 개인 경우 ?를 출력한다.
 */

public class A045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[]count = new int[26]; // 알파벳 사용 횟수를 저장할 배열

        String temp = input.toUpperCase(); // 입력 문자열을 대문자로 변환
        for (int i = 0 ; i < input.length() ; i++) {
            count[temp.charAt(i) - 65]++; // A~Z가 65~90이므로 -65한 인덱스에 ++
        }

        int maxIndex = 0;
        boolean flag = false;

        for(int i = 1 ; i < count.length ; i++) {
            if(count[i] > count[maxIndex]) { // maxIndex의 값보다 더 크면
                maxIndex = i; // maxIndex 최신화
                flag = false; // 많이 사용된 알파벳 여러개 여부 false
            } else if(count[i] == count[maxIndex]) { // maxIndex의 값과 같으면
                flag = true; // 많이 사용된 알파벳이 여러개임
            }
        }

        char result = (char)(maxIndex+65);

        if(flag)
            System.out.println("?");
        else
            System.out.println(result);
    }
}
