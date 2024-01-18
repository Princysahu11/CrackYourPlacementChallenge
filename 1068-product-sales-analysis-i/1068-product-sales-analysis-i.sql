# Write your MySQL query statement below

select Product.product_name , Sales.year, Sales.price from Sales left JOIN Product
ON sales.product_id = Product.product_id
