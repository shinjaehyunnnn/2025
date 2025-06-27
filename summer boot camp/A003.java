class A003 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9) // 해당 자리 수가 9이면 +1 값이 10이므로 0으로 치환하고 다음 자리 수로 이동
                digits[i] = 0;
            else { // 9가 아니면 그대로 1만 추가 한 상태로 return
                digits[i]++;
                return digits;
            }
        }

        // 자리 수가 늘어난 경우 1 더 큰 새로운 배열 생성
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
