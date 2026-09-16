select e.employee_id,
    name,
    (
        select count(reports_to) 
            from employees r
            where r.reports_to=e.employee_id
    ) as reports_count,
    (
        select ceil(avg(age)) 
            from employees r
            where r.reports_to=e.employee_id
    ) as average_age
from employees e
    where employee_id in (
        select reports_to
            from employees
            where reports_to is not null
    )
order by employee_id;