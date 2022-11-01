/* Write your PL/SQL query statement below */
select name as customers from (select * from customers minus
select c.id,c.name from customers c join orders o on c.id = o.customerId);