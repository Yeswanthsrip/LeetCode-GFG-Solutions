-- select customer_number
--     from (
--         select customer_number,
--         count(*) as count_cn,
--         max(count(*)) over() as max_count
--         from orders
--         group by customer_number
--     ) t
--     where count_cn = max_count;

select distinct customer_number
    from (
        select customer_number,count(customer_number) 
        over(partition by customer_number) as count_cn
        from orders
    ) t
    where count_cn =(
        select max(count_cn)
            from (
                SELECT
                    COUNT(customer_number) OVER (
                        PARTITION BY customer_number
                    ) AS count_cn
                FROM orders
            ) tt
    );

-- select customer_number,count(customer_number) 
--     over(partition by customer_number) as count_cn
--     from orders;

-- select customer_number,
--         count(*) as count_cn,
--         max(count(*)) over() as max_count
--         from orders
--         group by customer_number
