import java.util.Scanner;

/*
<백준 5598>
카이사르 암호는 알파벳 문자를 3개씩 건너뛰어 적은 암호이다.
카이사르 암호를 입력받고 원래 단어가 어떤 단어인지 출력하는 프로그램을 작성하여라
 */

public class A050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < input.length(); i++) { // 입력 문자열 길이만큼 반복
            int temp = 0;
            if(input.charAt(i) == 'A' || input.charAt(i) == 'B' || input.charAt(i) == 'C') { // 문자가 A,B,C인 경우 X,Y,Z가 될 수 있게  + 23
                temp = input.charAt(i) + 23;
            } else { // 그 외의 경우는 아스키 코드 -3 한 문자
                temp = input.charAt(i) - 3;
            }
            char ch = (char)temp; // 아스키값을 char형으로 변환 후
            result.append(ch); // StringBuilder에 덧붙임
        }

        System.out.println(result);
    }
}
