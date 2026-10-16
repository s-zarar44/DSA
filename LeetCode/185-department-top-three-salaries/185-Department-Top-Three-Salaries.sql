# Write your MySQL query statement below
with ranked_employees as (
    select d.name as Department, e.name as Employee, e.salary as Salary,
    Dense_Rank() over (
        partition by e.departmentId
        order by e.salary desc
    ) as r
    from Employee e 
    join Department d
    on e.departmentId = d.id
)

select Department, Employee, Salary
from ranked_employees
where r <= 3;