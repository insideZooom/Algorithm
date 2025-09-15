class Solution {
    public int solution(int[][] sizes) {
        int row = sizes.length;
        int col = sizes[0].length;
        // 성능적인 부분이 뭐 썩좋진 않겠지만?
        // 사실 그럼 큰걸 한쪽에 뭐 왼쪽에 몰고, col에 max값 각각 추출하면?
        // col1 * col2가 답
        for(int i=0; i<row; i++) {
            // row 한줄
            // 근데 무조건 2개잖아? -> 왼쪽이 큰걸로
            if(sizes[i][0] < sizes[i][1]) {
                //왼쪽이크면 냅둬 -> 오른쪽이 크면?
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }  
        }
        //일단 한쪽에 다 밀렸고
        //한줄씩 max를 찾아본다면?
        int [] result = new int[2];
        for(int i=0; i<col; i++) {
            int max = 0;
            for (int j=0; j<row; j++) {
                if(max < sizes[j][i]) {
                    max = sizes[j][i];
                }
            }
            result[i] = max;
        }
        return result[0] * result[1];
        
    }
}