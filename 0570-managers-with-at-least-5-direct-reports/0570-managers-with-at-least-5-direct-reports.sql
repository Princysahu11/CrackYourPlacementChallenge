# Write your MySQL query statement below

select e1.name
from Employee e1 JOIN Employee e2 
on e1.id = e2.managerId
group by e2.managerId
having COUNT(e1.id)>=5

