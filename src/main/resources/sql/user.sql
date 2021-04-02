create table user
(
    id    int auto_increment
        primary key,
    name  varchar(20) null,
    age   int         null,
    email varchar(50) null
);

INSERT INTO deadlock.user (id, name, age, email) VALUES (1, '1', 1, '1');
INSERT INTO deadlock.user (id, name, age, email) VALUES (2, '2', 2, '2');