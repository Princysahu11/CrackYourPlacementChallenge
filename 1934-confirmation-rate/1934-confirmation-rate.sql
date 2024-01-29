# Write your MySQL query statement below


select s.user_id, CASE WHEN c.time_stamp IS NULL then 0
ELSE ROUND(SUM( c.action = 'confirmed')/ COUNT(*),2) end AS   confirmation_rate 

from Signups as s LEFT JOIN Confirmations as c 
on s.user_id = c.user_id 
group by s.user_id