# Write your MySQL query statement below
select name as customers from Customers as c
left join Orders as O
on c.id=O.customerId 
where O.customerId is  null;