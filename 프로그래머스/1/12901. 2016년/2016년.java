import java.util.*;
import java.time.*;
import java.time.temporal.*; //이까지는 또 해야 함

class Solution {
    public String solution(int a, int b) {
        //뺀만큼 / 7해서 -> 나머지 만큼 월을 판별..?
        LocalDate standard = LocalDate.of(2016,1,1); //of
        LocalDate today = LocalDate.of(2016,a,b);
        // 일 차이
        long daysBetween = ChronoUnit.DAYS.between(standard, today);
        // 일차이를 기반으로 -> 이제 요일 계산
        // 딱 나눠 떨어지면 금요일이겠지
        System.out.println(daysBetween);
        long measure = daysBetween % 7;
        System.out.println(measure + ": measure");
        // 0이 금요일
        String [] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        return days[(int)measure];
    }
}