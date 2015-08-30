-- Создание таблиц с данными аутентификации --
create table users (
  user_name varchar(15) not null primary key,
  user_pass varchar(15) not null
);

create table roles (
  role_name varchar(15) not null primary key
);

create table user_roles (
  user_name varchar(15) not null,
  role_name varchar(15) not null,
  primary key(user_name, role_name )
);

-- TODO Связать таблицы, запилить в настройки аутентификации jdbcRealm

-- Создание таблиц с данными аутентификации --
INSERT INTO users (user_name, user_pass) VALUES ('wadzapi', 'changeit');

INSERT INTO roles (role_name) VALUES ('manager');
INSERT INTO roles (role_name) VALUES ('admin');
INSERT INTO roles (role_name) VALUES ('user');

INSERT INTO user_roles (user_name, role_name) VALUES ('wadzapi', 'manager');
INSERT INTO user_roles (user_name, role_name) VALUES ('wadzapi', 'admin');
INSERT INTO user_roles (user_name, role_name) VALUES ('wadzapi', 'user');
