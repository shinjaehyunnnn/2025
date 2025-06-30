import java.util.Arrays;

class A004 {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        for(int i = 0; i < arr.length; i++) // 배열 전체를 반복하여 나누어지면 count를 증가
            if(arr[i] % divisor == 0)
                count++;

        if(count == 0) // count가 0이면 -1이 담긴 배열을 return
            return new int[] {-1};

        int[] answer = new int[count]; // count길이만큼의 배열 생성
        int j = 0;

        for(int i = 0; i < arr.length; i++) // 나누어지는 숫자를 배열에 저장
            if(arr[i] % divisor == 0)
                answer[j++] = arr[i];

        Arrays.sort(answer); // 숫자 크기 순 정렬하여 return
        return answer;
    }
}
