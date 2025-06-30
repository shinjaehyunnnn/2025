import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class A011 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 결과를 저장할 배열
        ArrayList<FailRate> list = new ArrayList<>(); // 스테이지별 실패율을 구한 객체를 저장할 리스트
        int user = stages.length; // 스테이지별 점검 전 총 유저 수


        for(int i = 0; i < N; i++) { // 스테이지별로 실패율 점검
            int count = 0; // 스테이지에 머무르고 있는 유저 수 카운트
            double rate = 0.0; // 실패율


            for(int j = 0; j < stages.length; j++) // 유저 수를 전체 반복하여
                if(stages[j] == i+1) // 해당 스테이지에 머무르고있으면 카운트 증가
                    count++;

            if(user == 0) // 해당 스테이지의 유저 수가 0이면 실패율은 0
                rate = 0.0;
            else // 아닌 경우 머무르고있는 유저 / 전체 유저
                rate = (double)count / (double)user;


            FailRate stage = new FailRate(i+1, rate); // 스테이지 번호와 실패율로 객체 생성

            list.add(stage); // 리스트에 객체 추가
            user -= count; // 머무르고 있는 유저를 총 유저 수에서 제외
        }

        Collections.sort(list, new Comparator<FailRate>() {
            @Override
            public int compare(FailRate o1, FailRate o2) {
                if(Double.compare(o1.failRate, o2.failRate) == 0) // 만약 실패율이 같은 경우
                    return Integer.compare(o1.stageNum, o2.stageNum); // 스테이지 번호가 작은 것 부터
                return Double.compare(o2.failRate, o1.failRate); // 그 외의 경우 실패율이 높은 것 부터
            }
        });

        for(int i = 0; i < N; i++) // 스테이지 개수만큼 반복해서
            answer[i] = list.get(i).stageNum; // 실패율이 높은 순서대로 스테이지 번호를 배열에 저장

        return answer;
    }
}

class FailRate{
    int stageNum;
    double failRate;

    public FailRate(int i, double v) {
        stageNum = i;
        failRate = v;
    }
}




