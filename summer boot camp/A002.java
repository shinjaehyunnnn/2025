import java.util.*;

class A002 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < numRows; i++) { // numRow수 만큼 반복
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) // 각 행의 양 끝은 1이므로 양끝 인덱스인 경우 1 add
                    row.add(1);
                else { // 각 행의 양 끝이 아닌 경우
                    int prev = res.get(i-1).get(j-1); // 이전 행의 앞 인덱스 값
                    int next = res.get(i-1).get(j); // 이전 행의 뒤 인덱스 값
                    row.add(prev + next); // 이전 행의 앞, 뒤 인덱스의 합친 값을 row에 add
                }
            }
            res.add(row); // 결과 리스트에 행 추가
        }

        return res;
    }
}
