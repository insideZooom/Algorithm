class Solution {
    public int[] solution(String s) {
        //s의 각위치마다 자신보다 앞에 나왔으면서 자신과 가장 가까운곳에 있는 같은 글자 위치를 알고 싶다.
        //처음, 같은 글자 없음 -1
        //자신 앞에 있음 n, 가장 가까운 것 기준
        // 그려보고 더 생각하기
        int size = s.length();
        char[] ch = s.toCharArray();
        int [] result = new int[size]; //있으니까 -> 사실 이걸 초기에 다 -1로 선언하면되는 문제긴 함,,
        result[0] = -1; //이건 필수인 것
        for (int i=1; i<size; i++) {
            // System.out.println(ch[i] + ", 기준이 되는 문자열 " + i + ": idx"); // 맞음
            for (int j=i-1; j>=0; j--) {
                //먼저 찾는 것 break;
                if(ch[i] == ch[j]) {
                    //j는 이전값이야
                   result[i] =  i - j; //어쩃든 찾는값은 i그대로니가
                   break; //빠져나갈거니까 -> 첫번쨰 for
                } else {
                    result[i] = -1; //일단 넣고 아니면 reuslt가 됨
                }
            }
            // System.out.println("")
            //돌았는데도 없다? 그러면 -1을 넣음
            // result[i] = -1; //덮어쓰게 되네
            // System.out.println();
        }
        return result;
            // System.out.println(ch[i] + ", ch배열");
            /*
            for (int j=0; j<i; j++) {
                System.out.println(ch[j] + ", 핵심 위치의 이전 값들");
                //있으면? 넣는 것 -> ch[i]는 지금 내 위치, ch[j]는 이전
                if(ch[i] == ch[j]) {
                    //j의 idx를 넣는것
                    result[i] = i-j; //위치를 i-j로 해야함
                    //j가 아니라 차이를 구해야해서
                } else {
                    //아니면?
                    result[i] = -1;
                }
            }
            */

    }
}