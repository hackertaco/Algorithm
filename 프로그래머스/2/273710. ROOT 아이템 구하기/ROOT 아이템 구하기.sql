-- 코드를 작성해주세요


SELECT ITEM_ID, ITEM_NAME FROM ITEM_INFO WHERE ITEM_ID IN (select ITEM_ID from ITEM_TREE WHERE PARENT_ITEM_ID IS NULL);