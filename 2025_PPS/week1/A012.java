public class A012 {
    public int countPrimes(int n) {
        int count = 0;

        if (n < 2)
            return 0;

        int[] numbers = new int[n]; // n까지의 배열을 생성하고
        for (int i = 2; i < n; i++) { // 2부터 n-1까지 배열에 저장
            numbers[i] = i;
        }

        for (int i = 2; i < n; i++) {// 2부터 n-1까지
            if (numbers[i] != 0) { // 해당 숫자가 지워지지 않은 수이면 소수
                for (int j = i * 2; j < n; j += i) { // 소수의 배수들을 0으로 하여 삭제
                    numbers[j] = 0;
                }
            }
        }

        for (int i = 2; i < n; i++) { // 2부터 n-1까지 0으로 초기화 되지 않은 수를 찾고 count를 증가
            if (numbers[i] != 0) {
                count++;
            }
        }

        return count;
    }
}

/* 초기안 (Time Limit Exceeded)
        int count = 0;

        for(int i = 2; i < n; i++) {
            boolean isPrime = true;

            for(int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                count++;
        }

        return count;
    }
}

 */
