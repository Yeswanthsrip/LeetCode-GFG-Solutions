

select project_id,sum(year)/count(*) as average_years
    from (
        select project_id,
        project.employee_id,
        experience_years as year
        from project join employee on project.employee_id=employee.employee_id
    )t
    group by project_id;