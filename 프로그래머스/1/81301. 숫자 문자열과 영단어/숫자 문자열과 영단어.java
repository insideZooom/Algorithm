class Solution {
    public int solution(String s) {
        char [] ch = s.toCharArray(); 
        String [] mapping = {
"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
            };
        StringBuilder result = new StringBuilder(""); //나중에 변환할 값
        StringBuilder change = new StringBuilder("");
        for(int i=0; i<ch.length; i++) {
            if(!Character.isDigit(ch[i])) {
                //아니면? -> idx를 더해서 subStirng해서 mapping이랑 같은지 확인?
                //subString은 새로운 것을 만드는 것
                //근데 더 하기전에 change가 mapping안에 있는지 확인해야 한다.
                change.append(ch[i]); // 그리고 일단 더한다 -> 순서 변경
                for(int j=0; j<mapping.length; j++) {
                    if(change.toString().equals(mapping[j])) {
                        // 같으면?
                        result.append(j); //mapping된 걸 결과값에 넣고 -> mapping[j]가 아니라 j를 넣어야함
                        // System.
                        //빠져나간다
                        //그전에 StringBuilder를 다시 초기화해야한다.
                        change = new StringBuilder(""); //새로운 객체 결과값?
                        break;
                    }
                }                  
            } else {
                result.append(ch[i]); //숫자면 이거 진행
            }
        }
        int value = Integer.parseInt(result.toString());
        return value;
        
        // System.out.println(result);

    }
}