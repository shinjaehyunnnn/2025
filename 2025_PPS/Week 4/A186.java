import java.util.Scanner;

/*
<백준 9498>
점수를 입력받고 성적을 판별하는 프로그램을 작성하여라.
 */

public class A186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("A");
        } else if( score >= 80) {
            System.out.println("B");
        } else if( score >= 70) {
            System.out.println("C");
        } else if( score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
