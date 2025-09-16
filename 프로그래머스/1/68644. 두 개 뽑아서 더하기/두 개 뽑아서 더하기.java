import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //numbers에서 서로 다른 idx 두개를 뽑아서 더해서 만들 수 있는 모든 수
        int cnt = 0;
        //int [] result = new int[];        
        //개수가 얼마일지 모르니까
        // List<Integer> result = new ArrayList(); //여기에 추가한다.
        // 근데 그 전에 중복을 방지하는게 더 중요 -> stream도 가능할듯
        Set <Integer> set = new HashSet(); //hashSEt? -> set?
        //set에 추가 완전탐색을 통해서
        for(int i=0; i< numbers.length; i++) {
            for (int j=i+1; j< numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        //list로 바꾸기
        List<Integer> result = new ArrayList(set); //이거 int [] list로 만들어야함
        //int [] r = result.stream().mapToInt(i -> i).getToInt();
        //return r;
        //System.out.println(result.toString() + ";");
        //stream으로 list화
        int [] arr = result.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        return arr;
        
    }
}