class Solution {
    public int solution(int a, int b, int n) {
        int cnt = 0;
        while(n >= a) {
            int exchange = (n / a) * b;
            cnt += exchange;
            n = exchange + (n % a);
        }
        return cnt;
    }
}