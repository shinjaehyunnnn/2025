import java.util.Scanner;

/*
<백준 2753>
주어진 년도가 윤년이면 1을, 윤년이 아니면 0을 출력하는 프로그램을 작성하여라.
 */

public class A187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int result = 0;

        if(year % 400 == 0)
            result = 1;
        else if(year % 4 == 0 && year % 100 != 0)
            result = 1;

        System.out.println(result);
    }
}


