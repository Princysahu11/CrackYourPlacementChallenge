# Write your MySQL query statement below


with cte as 
(select query_name , (rating / position) as ratio, 
CASE
WHEN rating < 3 THEN 1
ELSE 0 END
as quality_binary
from queries)

select query_name,ROUND(AVG(ratio),2) as quality , 
round(SUM(quality_binary)/ COUNT(*) *100,2) As poor_query_percentage

from cte 
where query_name IS NOT NULL
group by query_name