# Write your MySQL query statement below
select person_name
from (
    select person_name,
    sum(weight) over (order by turn) as k
    from queue
)kg
where k<=1000
order by k desc
limit 1;