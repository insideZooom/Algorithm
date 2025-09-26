import java.util.*; 

class Solution {
    public int solution(int[] nums) {
        // 연구실 N마리 -> N/2마리 가져가도 됨
        // 종류에 따라 번호를 붙임
        // 같은 종류의 포켓몬은 같은 번호
        // 최대한 다양한 종류의 포켓몬을 가지길 원함 -> 가장 많은 종류의 포켓몬을 선택하는 방법 찾기
        // 그럼 NUMS의 개수 / 2 를 해서 -> MAX값을 정하고
        // 배열의 중복을 제거하고? -> MAX를 넘지 않으면 그 중복만큼 MAX를 넘으면 MAX만큼
        
        // 중복제거 -> STREAM의 DISTINCT 
        // SET함수
        int size = nums.length;
        Set<Integer> s = new HashSet();
        for(int i=0; i<size; i++) {
            s.add(nums[i]); //중복이 있으면 자동으로 없어지겠지?
        }
        //s에 있는 값이 얼마인지?
        if(size / 2 < s.size()){ //
            return size / 2;
        } 
        //같거나 작다면? 그만큼 return
        return s.size();
        
    }
}