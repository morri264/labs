-- 1#
SELECT * FROM northwind.customers;
--2#
select distinct country_region from northwind.customers ;
--3#
select last_name from northwind.customers where last_name like ('b%'); 
--4#
SELECT * FROM northwind.orders limit 100; 
--5#
select * from northwind.customers where zip_postal_code in = ('99999', '1010'); 
--6#
select * from northwind.orders where ship_country_region = (not null); 
--7#
select * from northwind.orders order by ship_country_region and ship_city;
--8#
insert into northwind.customers values ( '120','Grand Circus', 'Morris', 'Kyle','kylejmorris1@gmail.com','junour devopler','(313)555-5555','(313)555-5555', '(313)555-5555', '(313)555-5555', '1234 woodward ave', 'detroit', 'michigan','99999', 'USA', 'NULL', 'NULL','BLOB');
--9#
update northwind.orders set ship_zip_postal_code = '97201' where Ship_City = 'portland';
--10#
delete from order_details where order_details.quantity = '1'; 
--11#
SELECT min(quantity), max(quantity), avg(quantity) from order_details;
--12#
SELECT min(quantity), max(quantity), avg(quantity) from order_details group by order_details.order_id;
--13#
select customer_id from orders where id='65';
--14#
SELECT * FROM orders inner JOIN customers on orders.customer_id=customers.id;
SELECT * FROM orders left JOIN customers on orders.customer_id=customers.id;
SELECT * FROM orders right JOIN customers on orders.customer_id=customers.id;
-- 15#
select employees.first_name from employees where employees.notes is not null;
--16#.
SELECT ship_city FROM orders o inner JOIN customers c on o.customer_id=c.id where c.first_name='Francisco';