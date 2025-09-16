import java.util.*;

class Solution {
    public String solution(int[] food) {
        // 왼쪽 음식부터 오른쪽으로
        // 다른 선수는 오른쪽부터 왼쪽으로
        // 중앙에는 물, 물먼저 먹는 선수 승리 -> 먹는 순서, 종류 양이 같아야 함
        // 음식이 사용되지 못할 수 있음 

        //food 0이 -> 물 즉 홀수인 음식은 사용할 수 없음
        //idx 1번부터 돌림
        // int [] arr = new int[];
        // List<Integer> list = new ArrayList();
        StringBuilder sb = new StringBuilder(""); //이게 아마 객체일텐데
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                // list.add(i); //idx만큼 넣는다            
                sb.append(i);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb.toString()); //새로운 객체
        sb2.reverse();
        // System.out.println(sb2 + "sb2");
        sb.append(0);
        sb.append(sb2);
        //넣고 똑같이 
        // System.out.println(list.toString());
        return sb.toString();        
    }
}