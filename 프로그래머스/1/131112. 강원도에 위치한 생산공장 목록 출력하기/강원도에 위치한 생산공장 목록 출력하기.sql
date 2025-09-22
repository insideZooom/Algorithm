-- 코드를 입력하세요
-- 식품공장의 공장 id, 공장 이름, 주소
-- 강원도에 위치
-- TLNO 필요없음
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS -- 전체 선택 
FROM FOOD_FACTORY
WHERE ADDRESS LIKE "강원도%" -- 강원도에 위치한
ORDER BY FACTORY_ID -- 공장 id 기준 오름차순
-- 공장 ID 기준 오름차순