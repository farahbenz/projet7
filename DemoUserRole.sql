insert into user (user_id, active, email, last_name, name, password) values (1, 1, "admin@gmail.com", "s", "Sam", "sam"); 
insert into role (role_id, role) values (1, "ADMIN"); 
insert into user_role (user_id, role_id) values (1, 1);