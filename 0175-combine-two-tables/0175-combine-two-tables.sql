# Write your MySQL query statement below
select a.firstname , a.lastname , b.city , b.state
from person a
join address b on a.personid = b.personid;