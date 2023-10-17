# Write your MySQL query statement below
select p.product_id ,
IFNULL(ROUND(SUM(p.price*u.units)/sum(u.units),2),0) AS average_price
from Prices as p left JOIN UnitsSold as u
on p.product_id  = u.product_id 
AND(  u.purchase_date BETWEEN p.start_date AND p.end_date)
group by p.product_id 

# SELECT a.product_id,IFNULL(ROUND(SUM(b.units*a.price)/SUM(b.units),2),0) as average_price
# FROM Prices as a
# LEFT JOIN UnitsSold as b
# ON a.product_id=b.product_id AND (b.purchase_date BETWEEN a.start_date AND a.end_date)
# GROUP BY product_id;