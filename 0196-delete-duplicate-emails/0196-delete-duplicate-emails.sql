# Write your MySQL query statement below

delete p from person p join person o
on p.email=o.email
and p.id>o.id;