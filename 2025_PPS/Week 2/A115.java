/*
<LeetCode 1189>
문자열을 입력받고 문자열을 구성하는 문자로 만들 수 있는 ballon의 개수를 구하여라
 */


public class A115 {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[5];
        for(int i = 0; i < text.length(); i++) { // ballon을 구성하는 문자가 나오면 해당 문자에 해당하는 index의 값을 +1
            if(text.charAt(i) == 'a') {
                counts[0]++;
            } else if(text.charAt(i) == 'b') {
                counts[1]++;
            } else if(text.charAt(i) == 'l') {
                counts[2]++;
            } else if(text.charAt(i) == 'o') {
                counts[3]++;
            } else if(text.charAt(i) == 'n') {
                counts[4]++;
            }
        }

        counts[2] /= 2; // l의 경우 2개 필요하므로 /2
        counts[3] /= 2; // o의 경우 2개 필요하므로 /2

        int minIndex = 0;
        for(int i = 1; i < counts.length; i++) { // 가장 문자 개수가 적은 인덱스를 구함
            if(counts[i] < counts[minIndex]) {
                minIndex = i;
            }
        }

        return counts[minIndex];
    }
}
