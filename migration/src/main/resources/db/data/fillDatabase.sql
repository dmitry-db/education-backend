insert into faculty (id, "name")
values (3, 'Системы управления, информатика и электроэнергетика');

insert into department(id, "name", faculty_id)
values (304, 'Вычислительные машины, системы и сети', 3);

insert into "group"("name", department_id)
values ('М30-415Б-24', 304);

insert into student(surname, "name", middlename, email, group_id)
values ('Гунина', 'Валерия', 'Вячеславовна', 'gunina2002.yandex.ru', 1);

insert into teacher("name", surname, middlename, email, blocked, department_id)
values ('Иванов', 'Сергей', 'Семенович', 'ivanov.@yande.ru', false, 304);

insert into course("name", description, teacher_id)
values ('Сети и протоколы данных', 'Описание', 1),
       ('Графы', 'Изучение графов', 1);

insert into lecture ("name", description, course_id)
values ('first lection Сети', 'descripton first lection', 1),
       ('second lection Сети', 'descripton first lection', 1),
       ('first lection Графы', 'descripton first lection', 2),
       ('second lection Графы', 'descripton first lection', 2);

insert into course_student_link(course_id, student_id, finish)
values (1, 1, true), (2, 1, false);