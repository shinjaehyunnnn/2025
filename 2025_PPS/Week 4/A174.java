import java.util.Arrays;

/*
<programmers - 명예의 전당(1)>
"명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고, 시청자들의 문자 투표수로 가수에게 점수를 부여합니다.
매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다.
즉 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다.
k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면,
출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다.

이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다.
예를 들어, k = 3이고, 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면, 명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]입니다.

명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.
 */

public class A174 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int[] topThree = new int[k]; // 상위 k명의 점수를 저장할 배열
        for(int i = 0 ; i < score.length ; i++) {
            if(i < k) // i가 k보다 작으면 무조건 상위목록에 들어감
                topThree[i] = score[i];
            else if(score[i] > topThree[0]) // k일차 이후이고 상위 명단 중 가장 작은 점수보다 크면
                    topThree[0] = score[i]; // i번째로 대체

            if(i < k) // 상위 목록 배열을 오름차순 정렬하여 가장 앞에 가장 작은 점수가 나오게
                Arrays.sort(topThree, 0 ,i+1);
            else
                Arrays.sort(topThree, 0 , k);

            answer[i] = topThree[0]; // 가장 작은 점수를 저장함
        }

        return answer;
    }
}
