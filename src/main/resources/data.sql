-- employees

insert into public.employee (id, first_name, last_name, patronymic, birth_date, gender)
values (1, 'Петр', 'Петров', 'Петрович', ' 1986-12-12 ', true);

insert into public.employee (id, first_name, last_name, patronymic, birth_date, gender)
values (2, 'Иван', 'Иванов', 'Иванович', ' 1997-04-04 ', true);

insert into public.employee (id, first_name, last_name, patronymic, birth_date, gender)
values (3, 'Марина', 'Морская', 'Васильевна', ' 1999-11-07 ', true);

-- stack
insert into public.stack (stack_id, stack_name)
values (1, 'Git');

insert into public.stack (stack_id, stack_name)
values (2, 'Spring Boot');

insert into public.stack (stack_id, stack_name)
values (3, 'HTML');

insert into public.stack (stack_id, stack_name)
values (4, 'Java EE');

insert into public.stack (stack_id, stack_name)
values (5, 'Java Core');

insert into public.stack (stack_id, stack_name)
values (6, 'Maven');

insert into public.stack (stack_id, stack_name)
values (7, 'Spring');

insert into public.stack (stack_id, stack_name)
values (8, 'Rest');

-- contacts
insert into public.contacts (id, employee_id, phone, mail, skype, git)
values (1, 1, '+375(29)123-45-67', 'petrovich@gmail.com', '', 'http://github.com/petya');

insert into public.contacts (id, employee_id, phone, mail, skype, git)
values (2, 2, '+375(29)87-65-43', '', 'skype:ivanko', 'http://github.com/vanya');

insert into public.contacts (id, employee_id, phone, mail, skype, git)
values (3, 3, '+375(29)999-99-99', 'https://www.linkedin.com/in/mariya/', '', '');

-- employee-stack

insert into public.employee_stack (employee_id, stack_id)
VALUES (1, 1);

insert into public.employee_stack (employee_id, stack_id)
VALUES (1, 2);

insert into public.employee_stack (employee_id, stack_id)
VALUES (1, 3);

insert into public.employee_stack (employee_id, stack_id)
VALUES (2, 1);

insert into public.employee_stack (employee_id, stack_id)
VALUES (2, 4);

insert into public.employee_stack (employee_id, stack_id)
VALUES (2, 5);

insert into public.employee_stack (employee_id, stack_id)
VALUES (3, 6);

insert into public.employee_stack (employee_id, stack_id)
VALUES (3, 7);

insert into public.employee_stack (employee_id, stack_id)
VALUES (3, 8);