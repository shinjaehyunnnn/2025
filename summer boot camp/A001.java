import java.util.*;

class A001 {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0) return 0; // 두 배열의 길이 중 하나라도 0이면 만족하는 아이 수 없음

        //g와 s 오름차순 정렬
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0; // 만족시킨 아이들의 수
        int i = 0; // g 인덱스
        int j = 0; // s 인덱스

        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) { // s가 g를 만족시킬 때
                count++;
                i++;
                j++;
            }
            else // s가 g를 만족시키지 못했을 때
                j++;

        }

        return count;
    }
}
