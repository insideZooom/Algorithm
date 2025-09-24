-- 코드를 입력하세요
SELECT ROUND(AVG(DAILY_FEE)) AS "AVERAGE_FEE"
FROM CAR_RENTAL_COMPANY_CAR 
WHERE CAR_TYPE LIKE "SUV"
-- 자동차 종류가 SUV인 평균 일일 대여 요금 출력
-- 일일 대여 요금은 소수 첫번째에서 반올림