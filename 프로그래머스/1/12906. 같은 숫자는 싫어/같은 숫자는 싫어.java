import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList();
        result.add(arr[0]); //초기값은 넣고
        for(int i=1; i<arr.length; i++) { //1부터 시작
            // 배열은 다 돌되 이전값과 같은지
            if(arr[i] == arr[i-1]) {
                //같다면? 생략
                continue;
            }
            //없으면?
            result.add(arr[i]);
        }
        int [] returnVal = new int[result.size()];
        for (int i=0; i<returnVal.length; i++) {
            returnVal[i] = result.get(i);
        }
        return returnVal;
        
        
        //arr, 연속적인 숫자 하나만 남기고 전부 제거, 배열 arr의 원소들 순서 유지
        //treeset사용하면 해결아닌가..?
        // int[] result = arr.stream().mapToInt(i -> i).distinct(); -> stream 만들어서
        // System.out.println(result);
        // return arr;
        /*
        Set<Integer> s = new TreeSet(); //Treset 
        //Treeset에 똑같이 -> 아니면 stream.에 distinct
        for(int i=0; i<arr.length; i++) {
            s.add(arr[i]);
        }
        int [] result = new int[s.size()];
        for(int i=0; i<result.length; i++) {
             Integer num = s.get(i); //parseInt
             result[i] = num;
        }
        return result;
        */
    }
}