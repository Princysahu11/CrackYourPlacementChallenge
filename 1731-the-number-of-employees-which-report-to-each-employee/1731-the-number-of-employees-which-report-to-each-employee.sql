# Write your MySQL query statement below

WITH CTE AS(

select reports_to,COUNT(employee_id) AS  reports_count , ROUND(AVG(age),0) AS average_age
FROM Employees 
WHERE reports_to IS NOT NULL 
GROUP BY reports_to
    )
  select c.reports_to as employee_id, e.name , c.reports_count, c.average_age
  from cte as c
  left join employees as e
  on c.reports_to =  e.employee_id
  order by employee_id
