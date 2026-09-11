select max(customer_number) as customer_number
    from (
        select customer_number,count(customer_number) 
            over(partition by customer_number) as count_cn
            from orders
    ) t;