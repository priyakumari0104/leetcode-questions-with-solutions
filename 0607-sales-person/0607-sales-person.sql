select s.name from SalesPerson as s
where s.sales_id not in(
    select sales_id from Orders o 
    left join Company as c on 
    c.com_id=o.com_id
    where c.name="RED"
)