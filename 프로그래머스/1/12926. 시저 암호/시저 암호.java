class Solution {
    public String solution(String s, int n) {
        //ch배열로 만들고, 그 내용을 n만큼 더 추가하는 것 -> 아스키코드 관점으로 접근하면 될 것 같은데
        // - '0'은 숫자고 - 'a'는 알파벳? 
        // 근데 z -> a로.. 이거 예전 백준 과일을 생각하면 될 것 같은데 
        // A는 아스키 코드 65-90까지 
        // a는 97-122 -> 즉 범위가 90이상인지 보면됨이상인지 보면됨
        char [] ch = s.toCharArray(); //size만큼 만들고
        // 가장 큰 것은 ch에 담은게 없다는 것,,
        
        int alphaSize = 26; //알파벳 개수
        //아스키 코드 변환 ->
        //그러면 charAt을 하면 int변환이 되고, 그 int가 이제 범위를 넘는지 확인하고
        //숫자들을 더한 것을 다시 담아서  //int로 감싸주면 됨
        //공백은 32
        int [] intVal = new int[s.length()]; //이제 숫자 값이 들어있을텐데
        for(int i=0; i<ch.length; i++) {
            intVal[i] = (int)ch[i];
            // int test = (int)ch[i];
            // System.out.println(test);
            // System.out.println("int 변환 : + " + test);
        }
        // for(int i=0; i<intVal.length; i++) { //int 변환값 확인
        //     System.out.println(intVal[i]);
        // } -> 값이 확인됨
        
        
        // char [] result = new char[s.length()];
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<ch.length;i++) {
            if(intVal[i] == 32) {
                sb.append(' '); //그대로 공백
                continue; //여기는 끝내고 
            }
            //그게 아니면 이젠 확인 -> 97이 넘는지?
            int subResult = intVal[i] + n; //아스키코드 Char
            // System.out.println(subResult + ": sub");
            System.out.println(intVal[i] + ": int값");
            if(intVal[i] >= 97) { //소문자인경우
                // System.out.println("소문자" + i);
                // 122를 넘기면 안됨
                // 소문자의 경우가 지금 문제인 것
                if(subResult > 122) { //122를 넘길 경우?
                   sb.append((char)(subResult-alphaSize));
                } else {
                    sb.append((char)subResult);
                }
                // 그게 아니면?
            } else { //대문자인경우
                if(subResult>90) {
                   sb.append((char)(subResult-alphaSize));
                } else {
                    sb.append((char) subResult);
                }
            }
        }
        // System.out.println(sb);
        return sb.toString();

        
    }
}