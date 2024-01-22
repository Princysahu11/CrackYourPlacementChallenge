# Write your MySQL query statement below


select a1.machine_id , round(AVG(a2.timestamp - a1.timestamp),3) AS processing_time

from Activity a1 JOIN Activity a2
on a1.machine_id = a2.machine_id AND 
  a1.process_id = a2.process_id AND 
  a1.activity_type ='start'     AND
  a2.activity_type ='end'
  
  group by a1.machine_id