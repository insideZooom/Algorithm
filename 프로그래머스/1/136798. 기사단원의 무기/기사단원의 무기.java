class Solution {
    public int solution(int number, int limit, int power) { 
        // 15 -> 약수 4, 공격력 4인 무개 : number
        // 근데 만약 제한수치 3 : limit , 초과시 2 : power
        // 공격력 === 철
        int measure = 0;
        for(int i=1; i<=number; i++) {
            int cnt = 0; //약수 개수
            // int changedI = i; //changedI는 약수로 계속 바뀔 내용
            //changedI가 안바뀌네
            for(int j=1; j<=i/j; j++) { // 계속 바뀐다
                // 나머지 떄매 더해짐 
                if(j == (i/j) && (i%j == 0)) {// 라면?
                    cnt += 1;
                } else if((j*(i/j)) == i) {
                    cnt += 2;
                }
            }
            // System.out.println(cnt);
            // 만약 이 약수개수가? 
            if(cnt > limit) {
                //넘긴다면?
                cnt = power;
            }
            measure += cnt;
        }
        return measure;
    }
}