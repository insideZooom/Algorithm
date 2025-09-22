-- 코드를 입력하세요
SELECT COUNT(USER_ID) AS "USERS"
FROM USER_INFO
WHERE JOINED LIKE "2021%" 
    AND AGE BETWEEN 20 AND 29 -- 2021년

-- GENDER는 비어있거나 0또는 1의 값 -> 0은 남자 1은 여자
-- 2021년에 가입한 회원 중 나이가 20세이상 29세이상 회원이 몇명인지?