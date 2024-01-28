# Write your MySQL query statement below


select
p.product_id ,IFNULL( Round ((SUM(p.price * u.units) / SUM(u.units)),2),0) as average_price

from Prices p LEFT JOIN UnitsSold u
on p.product_id = u.product_id AND purchase_date BETWEEN p.start_date AND p.end_date

group by p.product_id

