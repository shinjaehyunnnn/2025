import java.util.Scanner;

public class A017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int[] input = new int[10];
        for(int i = 0; i < n.length() ; i++){
            if(n.charAt(i) == '6' || n.charAt(i) == '9'){ // 6이랑 9인 경우 6에 개수 추가
                input[6] += 1;
            }
            else{ // 그 외의 경우 각 숫자에 맞게 개수 추가
                int k = n.charAt(i) - '0';
                input[k] += 1;
            }
        }

        if(input[6] % 2 == 0) // 6 카운트 개수가 짝수면 /2
            input[6] /= 2;
        else // 6 카운트 개수가 홀수면 /2 한 것보다 1세트 더 필요
            input[6] = input[6]/2 + 1;

        int max = 0; // 필요한 세트의 개수
        for(int i = 0; i < input.length; i++){
            if(input[i] > max){
                max = input[i];
            }
        }

        System.out.println(max);
    }
}
