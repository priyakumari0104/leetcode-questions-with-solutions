delete p1 from Person as p
join Person as p1
on p.email=p1.email
where p.id<p1.id;