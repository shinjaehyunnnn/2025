import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < 8 ; i++) { // 8번의 입력을 받아 temp에 이어 붙음
            temp.append(sc.next());
        }

        if(temp.toString().equals("12345678")) // 12345678인 경우 ascending 출력
            System.out.println("ascending");
        else if(temp.toString().equals("87654321")) // 87654321인 경우 descending 출력
            System.out.println("descending");
        else // 그 외의 경우 mixed 출력
            System.out.println("mixed");
    }
}
