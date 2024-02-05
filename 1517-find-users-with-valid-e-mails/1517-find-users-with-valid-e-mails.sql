# Write your MySQL query statement below

select * 
from Users
where REGEXP_LIKE(mail,'^[a-zA-Z]+[a-zA-Z0-9\_\.\-]*@leetcode\\.com$')

# //^[A-Za-z]+[A-Za-z0-9\_\.\-]*@leetcode.com'