# Write your MySQL query statement below
select distinct s.email as Email 
from person p join person s 
on p.email=s.email 
and p.id!=s.id