# Write your MySQL query statement below


select p.product_name , sum(o.unit) as unit
from Products p LEFT JOIN Orders o
on p.product_id = o.product_id
where YEAR(o.order_date) ='2020' AND MONTH(o.order_date) = '02'
group by o.product_id
HAVING SUM(UNIT) >= 100