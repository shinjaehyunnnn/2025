import java.util.Scanner;

/*
<백준 18108>
불기년도가 주어지면 서기년도로 바꿔주는 프로그램을 작성하여라.
 */

public class A179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BE = sc.nextInt();
        int AD = BE - 543;
        System.out.println(AD);
    }
}
