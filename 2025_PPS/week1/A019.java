import java.util.Scanner;

public class A019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String total = Integer.toString(A * B * C); // total에 A,B,C의 곱한 값을 저장
        int[] result = new int[10]; // 0~9까지 개수를 저장할 배열

        for(int i = 0 ; i < total.length() ; i++){
            int temp = total.charAt(i) - '0'; // 각 자리수의 숫자를 구하고
            result[temp]++; // 그 숫자에 해당하는 인덱스에 1추가
        }

        for(int i = 0 ; i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
}
