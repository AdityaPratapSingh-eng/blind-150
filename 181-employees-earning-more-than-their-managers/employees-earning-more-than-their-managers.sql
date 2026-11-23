# Write your MySQL query statement below
 select e.name as employee from employee as e join employee as mn 
 on e.managerId= mn.id where e.salary > mn.salary;