create table if not exists faculty
(
    id          int primary key,
    name        varchar(255) not null,
    description varchar(1000),
    photo       bytea
);

create table if not exists department
(
    id          int primary key,
    name        varchar(255) not null,
    description varchar(1000),
    faculty_id  int          not null,
    foreign key (faculty_id) references faculty (id)
);

create table if not exists teacher
(
    id            serial primary key,
    name          varchar(255) not null,
    surname       varchar(255) not null,
    middlename    varchar(255),
    email         varchar(255),
    blocked       boolean,
    department_id int          not null,
    foreign key (department_id) references department (id)
);

create table if not exists course
(
    id          serial primary key,
    name        varchar(255) not null,
    description varchar(1000),
    teacher_id int not null,
    foreign key (teacher_id) references teacher (id)
);

-- create table if not exists teacher_course_link
-- (
--     teacher_id int not null,
--     course_id  int not null,
--     primary key (teacher_id, course_id),
--     foreign key (teacher_id) references teacher (id),
--     foreign key (course_id) references course (id)
-- );

create table if not exists lecture
(
    id          serial primary key,
    name        varchar(255)  not null,
    description varchar(1000) not null,
    doc         bytea,
    course_id   int not null
);

create table if not exists test (
    id serial primary key,
    name varchar(255) not null,
    description varchar(1000) not null,
    lecture_id int not null,
    foreign key (lecture_id) references lecture(id)
);

create table if not exists question (
    id serial primary key,
    quest varchar(255) not null,
    test_id int not null,
    foreign key (test_id) references test(id)
);

create table if not exists answer (
    id serial primary key,
    ans varchar(255),
    correct boolean not null,
    question_id int not null,
    foreign key (question_id) references question(id)
);

create table if not exists "group" (
    id serial primary key,
    name varchar(255) not null,
    department_id int not null,
    foreign key (department_id) references department(id)
);

create table if not exists student (
    id serial primary key,
    surname varchar(255) not null,
    name varchar(255) not null,
    middlename varchar(255),
    email varchar(255),
    photo       bytea,
    group_id int not null,
    foreign key (group_id) references "group"(id)
);

create table if not exists student_lecture_link (
    student_id int not null,
    lecture_id int not null,
    finish boolean,
    primary key (student_id, lecture_id),
    foreign key (student_id) references student(id),
    foreign key (lecture_id) references lecture(id)
);

create table if not exists course_student_link
(
    id serial primary key,
    course_id int not null,
    student_id int not null,
    finish      boolean default false,
    foreign key (course_id) references course(id),
    foreign key (student_id) references student(id)
);

create table if not exists test_student_finish_link
(
    test_id int not null,
    student_id int not null,
    primary key (test_id, student_id),
    foreign key (test_id) references test(id),
    foreign key (student_id) references student(id)
);

create table "user" (
    id serial primary key,
    username varchar(255) not null,
    password varchar(255) not null
);

create table authority (
    id serial primary key,
    name varchar(255)
);

create table if not exists user_authority
(
    user_id int not null,
    authority_id int not null,
    primary key (user_id, authority_id),
    foreign key (user_id) references "user"(id),
    foreign key (authority_id) references authority(id)
);

