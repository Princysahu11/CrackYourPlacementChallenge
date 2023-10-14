# Write your MySQL query statement below

select p.product_name,s.year,s.price
from Sales AS s JOIN Product AS p
on s.product_id = p.product_id