import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int [] arr = new int[k];
        for(int i=0; i<k; i++) {
            arr[i] = -1;
        }
        //일단 -1로 채우고
        //score를 모두 다 돈다.
        int [] result = new int[score.length];
        for (int i=0; i< score.length; i++) {
            // Arrays.sort(arr); //arr을 정렬해 [-1, -1, 10]
            //그리고 idx 0번에 값을 넣어
            if(arr[0] < score[i]) { 
                // continue; //무시해
                arr[0] = score[i]; //만약 넣으면? [10, -1, -1] 이겠지 -> 1이 들어가면 안됨
            }
            // [200,100, 150]
            //일단 가장 작은 값이 맨 왼쪽에 가야 함
            
            //사실 비효율적이지만 정석은 아닌 방법
            Arrays.sort(arr); // [100, 150, 200]
            //-1이 아닌 것 중에 가장 작은 것
            for (int j=0; j<k; j++) {
                if(arr[j]==-1) {
                    continue;
                }
                //그게아니다?
                //그 뒤에 바로 작은 것
                result[i] = arr[j]; // 10, 10, 10, 20,20, 100, 100
                break;
            }
            // min은 못할 것이고, 
            // resut[i] = arr[0]; //아마 
        }
        return result;
  
    }
}