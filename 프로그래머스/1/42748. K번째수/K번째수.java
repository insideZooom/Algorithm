import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //i번쨰~j번쨰까지 자르고 정렬**, k번쨰에 있는 수 구하기
        //idx가 아니라 진짜 i번쨰
        //commands에는 i,j,k => 그니까 col[0]-col[2]가 ijk고 row는 반복되는 배열의 개수;

        int[] result = new int[commands.length]; //size가 나올 것
        int i=0;
        int j=0;
        int k=0;
        //sbustring으로 자를 것-> 얼마만큼?
        for(int r=0; r<commands.length; r++) { //command length
            i = commands[r][0];
            j = commands[r][1];
            k = commands[r][2];  
            // System.out.println(i + ", " + j + ", " + k);
            
            int [] subResult = new int[j-i+1]; //개수 -> 2,3,4,5 맞게 들어간단 말임
            //맞게 들어가야하거든?
            int idx = 0;
            //subResult만큼 들어가야함 -> 그래서 2부터
            for(int s=i-1; s<j; s++) { //idx가 아니기 떄문에 -1적게
                subResult[idx] = array[s]; 
                idx++;
            }
            for (int s=0; s<subResult.length; s++){
                //System.out.println(subResult[s] + ":test");
            }
            
            //이걸 구해야함 -> 배열에 있기 떄문에
            // System.out.println(subResult.toString());
            Arrays.sort(subResult);
            // result[r] = subResult[k]; -> 여기서 문제가 되는 것 같은데
            result[r] = subResult[k-1]; //idx가 아니라 순서니까
        }
        return result;        
    }
}