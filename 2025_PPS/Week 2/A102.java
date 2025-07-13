/*
<LeetCode 867>
2차원 배열의 열과 행을 서로 바꾼 형태로 만드는 함수를 작성한다.
예를 들어
2, 4, -1
-10, 5, 11
18, -7, 6
과 같은 배열이 있으면
2, -10, 18
4, 5, -7
-1, 11, 6
이 된다.
 */


public class A102 {
    public int[][] transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length]; // 새로 구성할 배열

        for(int i = 0 ; i < matrix.length; i++){ // 배열의 열 길이만큼 반복
            for(int j = 0 ; j < matrix[i].length ; j++){ // 배열의 행 길이만큼 반복
                result[j][i] = matrix[i][j]; // 새로 구성할 배열에는 행과 열의 자리를 바꾸어서 저장
            }
        }

        return result;
    }
}
