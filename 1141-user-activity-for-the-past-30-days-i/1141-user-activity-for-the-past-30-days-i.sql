# Write your MySQL query statement below

SELECT activity_date AS day , COUNT(DISTINCT(user_id)) as active_users
FROM ACTIVITY 
WHERE activity_date BETWEEN  DATE_ADD('2019-07-27', INTERVAL -29 DAY) AND '2019-07-27'
GROUP BY activity_date
