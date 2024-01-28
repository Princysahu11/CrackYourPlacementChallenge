# Write your MySQL query statement below


# SELECT contest_id, 
# round(count (distinct user_id) *100
#       /
#       (SELECT COUNT(user_id) FROM Users ), 2) as percentage   
      
# FROM Register 
# GROUP BY contest_id 
# order by percentage DESC , contest_id


select contest_id , round (count(distinct user_id )*100
/(select count( user_id )from Users ),2)as percentage 
from Register 
group by contest_id 
order by percentage desc,contest_id