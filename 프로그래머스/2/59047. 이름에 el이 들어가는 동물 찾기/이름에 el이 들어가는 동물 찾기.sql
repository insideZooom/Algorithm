-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = "Dog"
    AND NAME LIKE "%el%"
ORDER BY NAME

-- 개이름에 EL이 들어감
-- EL이 들어가는 개의 아이디와이름 조회
-- 이름순으로 조회
-- 대소문자 구분 X