import java.util.Scanner;

public class A020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleInTrain = 0;
        int peopleGetOn; // 탑승한 사람
        int peopleGetOff; // 하차한 사람
        int max = 0;

        for(int i = 0 ; i < 4 ; i++)
        {
            peopleGetOff = sc.nextInt();
            peopleGetOn = sc.nextInt();

            peopleInTrain -= peopleGetOff;
            if(peopleInTrain > max) // 기차에 남은 사람이 기존 max보다 크면 max갱신
                max = peopleInTrain;

            peopleInTrain += peopleGetOn; // 기차에 남은 사람이 기존 max보다 크면 max갱신
            if(peopleInTrain > max)
                max = peopleInTrain;
        }

        System.out.println(max);

    }
}
