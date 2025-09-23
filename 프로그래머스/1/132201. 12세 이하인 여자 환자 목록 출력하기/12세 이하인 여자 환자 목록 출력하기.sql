-- 12세 이하의 여자 환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호 조회
-- 전화번호가 없는 경우 NONE 
-- 나이 기준 내림차순, 환자 이름 기준 오름차순
SELECT PT_NAME
      ,PT_NO
      ,GEND_CD
      ,AGE
      ,IFNULL(TLNO, "NONE") AS TLNO
FROM PATIENT 
WHERE AGE <= 12 
    AND GEND_CD = "W"
ORDER BY AGE DESC, 
         PT_NAME