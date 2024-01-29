# Write your MySQL query statement below

SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity 
WHERE activity_date BETWEEN DATE_ADD('2019-07-27' ,INTERVAL -30+1 DAY) and '2019-07-27'
GROUP BY activity_date