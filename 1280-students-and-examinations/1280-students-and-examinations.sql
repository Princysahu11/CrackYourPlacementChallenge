# Write your MySQL query statement below

select
st.student_id, st.student_name, sub.subject_name, COUNT(ex.subject_name) as attended_exams

from Students st   JOIN subjects sub LEFT JOIN Examinations ex
ON st.student_id = ex.student_id  AND  sub.subject_name = ex.subject_name

group by st.student_id, sub.subject_name
order by st.student_id, sub.subject_name





