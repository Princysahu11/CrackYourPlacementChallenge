# Write your MySQL query statement below

SELECT NAME FROM CUSTOMER 
WHERE coalesce(referee_id,0) <> 2

# here coalesce fxn is used to replace null values with 0 then it check whether it is equal to 2 or not