-- 코드를 입력하세요
# SELECT ONLINE_SALE_ID, O.USER_ID, COUNT(O.USER_ID)/ (SELECT COUNT(USER_ID) from USER_INFO WHERE JOINED LIKE '2021%') * 100 AS PUCHASED_RATIO
# FROM ONLINE_SALE O JOIN (SELECT USER_ID from USER_INFO WHERE JOINED LIKE '2021%') U ON O.USER_ID = U.USER_ID

# SELECT  USER_ID from USER_INFO WHERE JOINED LIKE '2021%'

# SELECT DATE_FORMAT(SALES_DATE, '%Y') AS YEAR,DATE_FORMAT(SALES_DATE, '%m') AS MONTH, SUM(1) AS PUCHASED_USERS

# FROM ONLINE_SALE
# GROUP BY DATE_FORMAT(SALES_DATE, '%Y'), DATE_FORMAT(SALES_DATE, '%m');

SELECT 
DATE_FORMAT(SALES_DATE, '%Y') AS YEAR, 
CAST(DATE_FORMAT(SALES_DATE, '%m') as unsigned) AS MONTH, 
COUNT(DISTINCT O.USER_ID) AS PURCHASED_USERS, 
ROUND(COUNT(DISTINCT O.USER_ID)/(SELECT COUNT(USER_ID) from USER_INFO WHERE JOINED LIKE '2021%'), 1) AS PURCHASED_RATIO
FROM ONLINE_SALE O JOIN (SELECT USER_ID from USER_INFO WHERE JOINED LIKE '2021%') U ON O.USER_ID = U.USER_ID

GROUP BY DATE_FORMAT(SALES_DATE, '%Y'), DATE_FORMAT(SALES_DATE, '%m')
ORDER BY YEAR, MONTH
# ;
