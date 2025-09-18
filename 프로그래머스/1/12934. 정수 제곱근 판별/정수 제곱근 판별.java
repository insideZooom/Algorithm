class Solution {
    public long solution(long n) { //Math.pow() 제곱
        // Math.sqrt()제곱근?
        
        // 제곱근으로 접근하면 되겠네
        // 그니까 n이 Math.sqrt()로 나온 값
        // 그 값 * 그 값 -> Math.pow겠지? 근데 일단 그냥 단순 **를 했을떄 n과 같은지?
        // 같으면 sqrt의 값+1의 **를 하고 아니면 -1
    
        long value = (long) Math.sqrt(n); //sqrt가 double이네  -> 일단 double로
        if(value * value == n) {
            //같으면?
            return (value+1) * (value+1);
        }
        System.out.println(value);
        return -1;
        
        
        // Long v = (Long) value; // 되나? -> double을 int로 바꾸는 방법 (int)로 형변환?
        // long v = (long) value; -> 객체 타입의 문제
        // System.out.println(value);
        // int v = (int) Math.pow(value); //pow는 dobule이어야한다
        // double v = Math.pow(value, 2);
        // int v = (int) Math.pow(value, 2);
        //  if(v == n) {
            // 이거일 경우
            // return (int) Math.pow(value+1, 2);
        // }
        // return -1;
        // System.out.println(v);
        // System.out.println(v);
    }
}