create table public.employee
(
    id         integer not null,
    first_name varchar(50),
    last_name  varchar(50),
    patronymic varchar(50),
    birth_date timestamp,
    gender     boolean,
    primary key (id)
);

create table public.contacts
(
    id          integer not null,
    employee_id integer,
    phone       varchar(50),
    mail        varchar(50),
    skype       varchar(50),
    git         varchar(100),
    foreign key (employee_id) REFERENCES employee (id),
    primary key (id)
);

create table public.stack
(
    stack_id   integer not null,
    stack_name varchar(50),
    primary key (stack_id)
);

create table public.employee_stack
(
    employee_id integer not null,
    stack_id    integer not null,
    primary key (employee_id, stack_id),
    foreign key (employee_id) REFERENCES employee (id),
    foreign key (stack_id) REFERENCES  stack (stack_id)
);