class Solution {
    public long[] solution(int x, int n) {
        // x부터 x씩증가하는 것 n개의 리스트를 return
        long [] size = new long[n]; //n개 -> long을 넘을때,,? bigint처리, 근데 long type
        //bigint정도 되야 수용할 수 있을 것 같은데 어떻게 넣음 -> long으로 반환ng으로 반환
        for(int i=0; i<size.length; i++) {
            size[i] = (long) x * (i+1);
        }
        return size;
        
        
        // long[] answer = {};
        // return answer;
    }
}