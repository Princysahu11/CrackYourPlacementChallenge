# Write your MySQL query statement below

select class
from Courses 
group by class 
HAVING COUNT(student) >=5
