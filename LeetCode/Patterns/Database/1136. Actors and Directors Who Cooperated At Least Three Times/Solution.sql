select actor_id,director_id from(
    select actor_id,director_id 
        from actordirector
            where actor_id=director_id
) t
    group by actor_id,director_id;