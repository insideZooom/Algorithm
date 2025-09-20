import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이 result의 결과값이 어떻게 될지 모르네 
        // name의 개수도 아니고, photo의 개수도 아니니까 -> 이게 idx 배열 사이즈 이슈였을듯
        List<Integer> result = new ArrayList(); //결과값
        for(int r=0; r<photo.length; r++) {
            //photo row가 photo[r] -> 그 자체 -> 그리고 col은 photo[r][c]가 될 것
            //photo col이 size가 될텐데 -> 이건 계속 동적으로 바뀔 것임
            //photo[r]이 -> 예를들면[may, kein, kain, radi]; 인거니까 -> 이 배열길이O
            int memories = 0; //기억 상자 추가값
            // int [] col = new int[photo[r].length]; //-> 그니까 0으로 세팅ㄴㄴ, 동적
            //col기준으로 name을 돌아야함
            for(int c=0; c<photo[r].length; c++) { //이게 동적인 것인지 -> col
                // System.out.println(photo[r].length + ": 길이");
                // System.out.println(photo[r][c] + ": 현재 값");
                //기준이 되는 col -> name과 비교
                for(int i=0; i<name.length; i++) {
                    if(name[i].equals(photo[r][c])) { //같다면? -> equals
                        memories += yearning[i]; //똑같은 것 매핑
                        break; //for문 종료
                    }
                }
            }
            // System.out.println(memories); //계산된 값이 없음
            //memories를 result에 담긴
            result.add(memories); // 
        }
        //result에 배열값을 담는다. -> list로 stream으로 아마 가능할 것
        //일단 출력값 확인
        // System.out.println(result);
        int [] rVal = new int[result.size()];
        for(int i=0; i<rVal.length; i++) {
            rVal[i] = result.get(i);
        }
        return rVal;
        
    }
}