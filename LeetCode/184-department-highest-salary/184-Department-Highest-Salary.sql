# Write your MySQL query statement below
with ranked_employees as (
    select d.name Department, e.name Employee, e.salary Salary,
    rank() over (
        partition by d.id
        order by e.salary desc
    ) as r
    from Employee e
    join Department d
    on e.departmentId = d.id
)

select Department, Employee, Salary
from ranked_employees
where r = 1;