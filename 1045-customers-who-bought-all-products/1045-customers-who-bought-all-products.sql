# Write your MySQL query statement below

select cus.customer_id
from Customer cus 
group by cus.customer_id
HAVING COUNT(Distinct product_key) = (Select COUNT(*) from product)

