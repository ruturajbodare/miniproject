use collegecourse;
create table customer(cid int,cname varchar(67),address varchar(56),age int,orderproducts varchar(45));
select * from customer;
insert into customer(cid,cname,address,age,orderproducts)values(1001,'ruturaj','phaltan',22,'shirt'),(1002,'pooja','wai',24,'saree'),(1003,'pranit','phaltan',22,'books');
alter table customer add column phon int(10);
desc customer;
alter table customer modify column cname text(78);
alter table customer add column (qualification varchar(67),permanentadd varchar(24));
alter table customer modify column cname varchar(67), modify column qualification text(78);
alter table customer  drop column permanentadd;
create table product(pid int,pname varchar(67),age int,address varchar(67));
select * from product;
truncate table product;
rename table product to productdetails;
drop table productdetails;
alter table customer rename column cname to customername;
/*comments*/
/*update query */
update customer set age=20,orderproducts='t-shirt',phon=7774999636,qualification='btech' where cid=1003;
delete from customer where cid=1003;