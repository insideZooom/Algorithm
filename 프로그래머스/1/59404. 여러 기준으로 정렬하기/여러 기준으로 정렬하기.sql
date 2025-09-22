-- 동물의 아이디와 이름, 보호 시작일을 이름순으로 조회
-- 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 보여줘야 함
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
-- 이름을 사전순으로 먼저 정렬해야함
ORDER BY NAME, DATETIME DESC -- 내림차순, 근데 이게 이름이 같은 동물 중에서 