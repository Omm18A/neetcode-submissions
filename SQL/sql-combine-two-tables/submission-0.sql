-- Write your query below
select first_name, last_name, city, state from person Left join address on person.person_id=address.person_id 