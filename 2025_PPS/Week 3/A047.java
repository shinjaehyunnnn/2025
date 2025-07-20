import java.util.Scanner;

/*
<백준 11721>
최대 길이 100자의 문자열을 입력받고 10글자씩 끊어 줄바꿈을 하여 출력하는 프로그램을 작성하여라.
 */
public class A047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] result = new String[10]; // 10문자씩 자른 결과를 저장할 배열
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for(int i = 0 ; i < input.length() ; i++) {
            char ch = input.charAt(i); // i번째 문자를 구한 후
            sb.append(ch); // sb에 덧붙임

            if(sb.toString().length() == 10) { // sb의 길이가 10이 되면
                result[index++] = sb.toString(); // 배열에 저장하고 index 위치 이동
                sb = new StringBuilder(); // sb는 초기화
            }
        }

        result[index] = sb.toString(); // 마지막 남은 sb 배열에 저장

        for(int i = 0 ; i < result.length ; i++) { // 값이 있는 인덱스의 문자만 출력
            if (result[i] != null)
                System.out.println(result[i]);
        }
    }
}
