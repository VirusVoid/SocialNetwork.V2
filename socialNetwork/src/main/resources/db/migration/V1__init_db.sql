
create table if not exists users
(
    id serial not null,
    name varchar(100) not null,
    surname varchar(100) not null,
    age int4,
    gender varchar(1),
    interests varchar(255),
    city varchar(255),
    primary key (id)
);

create table if not exists friends
(
    first_friend serial not null references users(id),
    second_friend serial not null references users(id),
    primary key (first_friend, second_friend)
)