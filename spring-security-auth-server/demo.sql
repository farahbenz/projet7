insert into user(user_id,active,email,last_name, name, password) value (1, true, "farahben@wanadoo.fr", "fafa", "ben", "123");
insert into role (role_id, role) value (1, "admin");
insert into user_role (user_id, role_id)value(1, 1);