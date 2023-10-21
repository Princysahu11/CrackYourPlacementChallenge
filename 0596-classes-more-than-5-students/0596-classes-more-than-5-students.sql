# Write your MySQL query statement below

select class
FROM COURSES 
GROUP BY class
HAVING COUNT(STUDENT) >= 5