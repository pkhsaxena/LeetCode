/* Write your PL/SQL query statement below */
-- select MOD(100,2)=true from dual;
select employee_id, salary as bonus from Employees where MOD(employee_id,2)=1 and name not like 'M%'
union
select employee_id, 0 as bonus from Employees where MOD(employee_id,2)=0 or name like 'M%'
