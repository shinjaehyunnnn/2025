import java.util.*;

/*
<백준 1302>
테스트케이스를 입력받고 서점에서 테스트케이스만큼의 권수가 팔렸다고 하였을때 가장 많이 팔린 책의 이름을 출력하여라
만약 가장 많이 팔린 책이 여러 개인 경우 사전순으로 앞에오는 책의 이름을 출력하여라
 */

public class A135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt(); // 테스트케이스 개수
        HashMap<String, Integer> map = new HashMap<>(); // 책 이름과 팔린 개수를 저장할 Map

        for(int i = 1; i <= testCase; i++){
            String bookName = sc.next();
            if(!map.containsKey(bookName)){ // 책이름이 Map에 존재하지 않으면
                map.put(bookName, 1); // 책 이름과 1을 저장
            } else { // 책이름이 Map에 존재하면
                map.put(bookName, map.get(bookName) + 1); // 책 이름으로 get하고 1을 추가하여 저장
            }
        }

        int max = 0;
        for(String bookName : map.keySet()){ // Map을 전체 반복해서 가장 많이 팔린 권수를 구함
            max = Math.max(max, map.get(bookName));
        }

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){ // 가장 많이 팔린 책들을 list에 저장
                list.add(entry.getKey());
            }
        }

        Collections.sort(list); // list를 이름순으로 정렬 후 가장 첫번째 책 이름을 출력
        System.out.println(list.get(0));
    }
}
