# Write your MySQL query statement below
select name as Employee from Employee e where e.salary > (select salary from Employee emp where emp.Id = e.ManagerId)