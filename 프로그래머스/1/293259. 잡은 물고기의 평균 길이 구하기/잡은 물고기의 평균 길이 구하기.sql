-- 코드를 작성해주세요

SELECT ROUND(AVG(IFNULL(LENGTH, 10)), 2) AS "AVERAGE_LENGTH"
FROM FISH_INFO

-- 평균 길이를 나타내고, 평균 길이는 소수점 3쨰자리에서 반올림
-- 10CM이하의 물고기는 10CM로 취급해서 평균길이로 