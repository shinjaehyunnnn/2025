import java.util.Scanner;

/*
<백준 5622>
다이얼 전화기를 사용하여 전화를 걸 때 걸리는 최소 시간을 구하여라
숫자 1을 걸려면 총 2초가 필요하고 1보다 큰 수를 거는데 걸리는 시간은 한 칸당 1초씩 더 걸린다.
숫자에 해당하는 문자로 전화번호를 외웠기에 문자가 주어지면 그 문자에 해당하는 숫자에 전화를 건다.
 */

public class A051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            switch (ch) {
                case 'A' : case'B' : case 'C' :
                    sum += 3;
                    break;

                case 'D' : case'E' : case 'F' :
                    sum += 4;
                    break;

                case 'G' : case'H' : case 'I' :
                    sum += 5;
                    break;

                case 'J' : case'K' : case 'L' :
                    sum += 6;
                    break;

                case 'M' : case'N' : case 'O' :
                    sum += 7;
                    break;

                case 'P' : case'Q' : case 'R' : case 'S' :
                    sum += 8;
                    break;

                case 'T' : case'U' : case 'V' :
                    sum += 9;
                    break;

                case 'W' : case'X' : case 'Y' : case 'Z' :
                    sum += 10;
                    break;
            }
        }
        System.out.println(sum);
    }
}
