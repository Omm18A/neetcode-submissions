-- Write your query below
SELECT employee_id, case when employee_id%2=0 OR (name Like 'M%') then 0 else salary END as bonus from employees order by employee_id
