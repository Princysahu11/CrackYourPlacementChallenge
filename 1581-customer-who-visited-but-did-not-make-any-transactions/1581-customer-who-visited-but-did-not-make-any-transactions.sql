SELECT v.customer_id , COUNT(v.visit_id) as count_no_trans
FROM Visits as v left JOIN 
     transactions as t 
ON v.visit_id = t.visit_id
where t.transaction_id IS NULL
group by v.customer_id