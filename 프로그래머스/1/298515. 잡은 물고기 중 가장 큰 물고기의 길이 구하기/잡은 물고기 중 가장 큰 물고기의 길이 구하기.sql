-- 코드를 작성해주세요
SELECT CONCAT(MAX(LENGTH), 'cm') AS MAX_LENGTH
FROM FISH_INFO 
WHERE LENGTH IS NOT NULL

-- 10이하인경우, LENGTH가 NULL이며, LENGTH가 NULL 인경우가 없음
-- 가장 큰 물고리 길이 CM 붙여서 출력