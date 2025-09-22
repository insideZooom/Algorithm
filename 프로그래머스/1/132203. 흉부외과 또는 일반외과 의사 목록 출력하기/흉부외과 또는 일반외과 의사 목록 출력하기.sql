-- 진료과가 CS거나 GS인 의사의 이름, 의사 ID, 진료과, 고용일자를 조회
-- 고용일자 기준으로 내림차순 정렬, 고용일자가 같으면 이름 기준 오름차순 정렬
SELECT DR_NAME, DR_ID, MCDP_CD, SUBSTR(HIRE_YMD, 1, 10) -- 1부터 시작 IDX
FROM DOCTOR
WHERE MCDP_CD LIKE "CS%" 
    OR MCDP_CD LIKE "GS%"
ORDER BY HIRE_YMD DESC, DR_NAME