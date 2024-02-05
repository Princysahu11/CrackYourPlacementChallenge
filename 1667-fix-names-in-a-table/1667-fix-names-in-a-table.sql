# Write your MySQL query statement below

SELECT user_id, concat( UPPER(left(name,1)) ,LOWER(right(name,length(name)-1)) ) as name

FROM Users
order by user_id



                             