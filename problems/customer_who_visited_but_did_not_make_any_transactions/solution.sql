/* Write your PL/SQL query statement below */
select distinct customer_id, count(*) as count_no_trans from Visits v join (
select distinct visit_id from visits minus select visit_id from Transactions) d on v.visit_id=d.visit_id group by customer_id;