-- 코드를 입력하세요
-- 상품코드 -> 앞2자리는 카테고리 코드 의미
-- 가장 높은 판매가를 출력하는 SQL, 컬럼명은 MAX_PRICE
SELECT MAX(PRICE) AS 'MAX_PRICE'
FROM PRODUCT
-- WHERE 