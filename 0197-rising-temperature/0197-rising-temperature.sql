select w1.id
from weather as w1 JOIN weather as w2 
on DATEDIFF(w1.recordDate,w2.recordDate) =1 AND 
   w1.temperature > w2.temperature