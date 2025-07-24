import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
<LeetCode 884>
주어진 두 문장에서 한번만 나온 단어를 반환하는 함수를 작성하여라.
 */

public class C018 {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> countMap = new HashMap<>();

        for (String word : (s1).split(" ")) { // s1을 띄어쓰기 단위로 나눈 후 나왔던 단어이면 +1, 안나왔던 단어이면 1로 초기화
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : (s2).split(" ")) { // s2을 띄어쓰기 단위로 나눈 후 나왔던 단어이면 +1, 안나왔던 단어이면 1로 초기화
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for(HashMap.Entry<String, Integer> entry : countMap.entrySet()) { // value가 1인 것만 list에 추가
            if(entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}
