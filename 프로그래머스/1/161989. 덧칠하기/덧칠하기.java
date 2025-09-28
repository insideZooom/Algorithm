import java.util.*;
// string으로 있는지 확인
class Solution {
    public int solution(int n, int m, int[] section) { 
        // return n/m; -> 롤러 만큼
        // 그니까 최대 칠할 수 있는 개수가 n/m인거고 
        // section범위에 없으면 skip할 수 있는 것
        
        //첫번째 section + m  : 담아 container
        //두번쨰 section이 : container보다 작으면 교체 ㄴㄴ
        //크거나같음녀 교체
        //세번째 
        //마지막 section이 -> n을 넘기면 안됨, 그니까 section i + m이 n일떄까지
        int container = section[0] + m; //
        int cnt = 1; //시작할거니까
        for(int i=0; i<section.length; i++) {
            //범위가 있음
            if(section[i] >= container) { //콘테이너
                //교체해 -> 그리고 카운트 해 
                container = section[i] + m;
                cnt++; //그리고 증가해 범위내니까
            }
        }
        return cnt;
        
    }
}