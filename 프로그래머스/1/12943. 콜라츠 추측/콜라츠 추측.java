class Solution {
    public int solution(int num) {
        if(num == 1) {
            return 0;
        }
        long n = num;
        int cnt = 0; //count 개수 
        while(n != 1 && cnt < 500) { //500번을 넘길 수 없기 때문에 맞음
            //1번 process
            if(n % 2 == 0) { //짝수일경우
                n = n / 2; //num에 2로 나누기
            } else {
                n = (n * 3) + 1;
            }
            //2번 process
            cnt++; //1번 카운트
            System.out.println(num + " : num," + cnt + ": cnt");

        }
        // System.out.println(num + ": num"); //그니까 왜 num이 1이 될까
        return (cnt >= 500) ? -1 : cnt;
    }
}