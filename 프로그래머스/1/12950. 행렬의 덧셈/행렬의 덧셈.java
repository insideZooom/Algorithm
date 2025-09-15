import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // ArrayIndexOutOfBoundsException
        int row = arr1.length;
        int col = arr1[0].length; //길이들은 맞음
        // System.out.println(row + ", " + col);
        int [][] arr = new int [row][col]; //맞게 이차원 배열 선언했는지부터 확인 -> 이거 맞는거 아님? 왜 범위가 초과했다고 하지?
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]); //이제 범위 초과
        
        /*
        for(int i=0; i<row; i++) {
            // System.out.println(arr[i]); //아 row로 해서,,,
            System.out.println(Arrays.toString(arr[i]));
        } //맞게 잘 들어가는게 맞음
        */
        for(int i=0; i<row; i++) {
            int[] rArr = new int[col]; //col개수만큼
            for (int j=0; j<col; j++) {
                rArr[j] = arr1[i][j] + arr2[i][j];
                // System.out.println(arr1[i][j] + ": arr1, " + arr2[i][j] + ": arr2");
            }
            arr[i] = rArr;
        }
        return arr;
        
        // 범위가 잘돌아갔는지 확인

        /*
        for(int i=0; i<row; i++) {
            Arrays.toString(arr[row]); //끝? -> 이것자체가 범위를 벗어난데,,
        }
        */
        
        

        /*
        //왜 idx가 범위를 벗어남?
        for (int i=0; i<row; i++) {
            // System.out.println("row : " + row);
            // System.out.println("row : " + arr[row]); // row의 한 행 -> idx범위 벗어남
            for (int j=0; j<col; j++) {
                // System.out.println("row: " + row + ", col : " + col);
                // System.out.println("col : " + col);
                // System.out.println("col: " + arr[row][col]); //한 row의 col들
            }
        }
        return arr;
        */
        
        
        /*
        for(int i=0; i<row; i++) {
            // int [] rArr = new int[row];
            int [] rArr = new int[col]; //한 행에 이만큼 드가는 거니까
            for(int j=0; j<col; j++) {
                rArr[i] = arr[i][j] + arr2[i][j]; //[j] -> array가 요구되지만 찾을 수 없음
                //배열한개에 값 하나씩
            }
            arr[i] = rArr;
        }
        return arr;
        */   
    }
}