# Write your MySQL query statement below


WITH cte AS (
SELECT *, 
RANK()OVER(PARTITION BY product_id ORDER BY year) AS RNK
FROM SALES
    )
    
select product_id, year as first_year, quantity, price
FROM cte 
where RNK =1;