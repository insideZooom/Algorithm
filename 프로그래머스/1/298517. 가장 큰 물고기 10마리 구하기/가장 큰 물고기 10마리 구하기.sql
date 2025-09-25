-- 코드를 작성해주세요
SELECT ID, LENGTH -- 가장 큰 물고기 10마리의 ID와 길이를 출력하는 SQL
FROM FISH_INFO 
ORDER BY LENGTH DESC, ID -- 길이를 기준으로 내림차순, 길이가 같다면 물고기 ID에 대해 오름차순
LIMIT 10 -- 가장 큰 물고기 10마리

-- 잡은 물고기 길이가 10이하일경우 LENGTH는 NULL

