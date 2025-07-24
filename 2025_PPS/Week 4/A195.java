import java.util.Scanner;

/*
<백준 2438>
정수가 주어지면 정수번째 줄까지 n번째 줄에 n개의 별을 찍는 프로그램을 작성하여라
 */
public class A195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();

        for(int i = 1; i <= lines; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
