select employee_id,
    case
        when employee_id%20 or left(name,1) like "M" then 0
        else salary
    end as bonus
from employees
order by employee_id;