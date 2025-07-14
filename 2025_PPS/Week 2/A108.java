import java.util.Scanner;

/*
<백준 3062>
원래 입력한 수와 그 수를 뒤집을 수를 합한 수가 좌우 대칭이 되는지 테스트하는 프로그램을 작성하라.
 */

public class A108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 판별할 숫자 개수
        String[] result = new String[count]; // 판별 결과를 저장할 배열

        for(int i = 0 ; i < count ; i++) {
            String input = sc.next(); // 숫자를 입력
            String reverse = ""; // 입력값을 뒤집은 값

            for(int j = input.length()-1 ; j >= 0 ; j--) {
                reverse = reverse + input.charAt(j); // 입력 숫자를 뒤에서 부터 reverse에 저장
            }

            int sum = Integer.parseInt(input) + Integer.parseInt(reverse); // int형으로 변환 후 더함
            String sumString = Integer.toString(sum); // 더한 값을 다시 String형으로
            boolean isPalindrome = true;

            for(int k = 0 ; k < sumString.length()/2 ; k++) { // 왼쪽과 오른쪽을 순서대로 비교
                char left = sumString.charAt(k);
                char right = sumString.charAt(sumString.length() -k - 1);

                if(left != right) // 만약 다르다면 false
                    isPalindrome = false;
            }

            if(isPalindrome)
                result[i] = "YES";
            else
                result[i] = "NO";
        }

        for(int i = 0 ; i < result.length ; i++) {
            System.out.println(result[i]);
        }


    }
}
