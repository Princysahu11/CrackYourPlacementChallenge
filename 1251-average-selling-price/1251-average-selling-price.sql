# Write your MySQL query statement below


select p.product_id ,

IFNULL(ROUND(SUM(p.price*u.units)/sum(u.units),2),0) AS average_price

from Prices as p LEFT JOIN UnitsSold as u

on p.product_id  = u.product_id 
AND(  u.purchase_date BETWEEN p.start_date AND p.end_date)
group by p.product_id 

