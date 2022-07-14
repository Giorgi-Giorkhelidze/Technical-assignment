create database School;



create table Teacher
(
TeacherID serial primary key,
TName varchar(255) not null,
TSurname varchar(255) not null,
TGender varchar(10) default('Male') check(TGender in ('Male', 'Female')),
Tsubject varchar(100) not null
);


create table Pupil
(
PupilID serial primary key,
PName varchar(255) not null,
PSurname varchar(255) not null,
PGender varchar(10) default('Male') check(PGender in ('Male', 'Female')),
PClass varchar(2) default('1') check(PClass in ('1','2','3','4','5','6','7','8','9','10','11','12'))
);

create table TeacherPupil
(
TeacherPupilId serial primary key,
PupilId serial references Pupil(PupilID) on update cascade on delete cascade,
TeacherId serial references Teacher(TeacherID) on update cascade on delete cascade,
unique (PupilId, TeacherId)
);

insert into Teacher(TName, TSurname, TGender, Tsubject)
values
('Rachelle','Atkinson','Female','History'),
('Harrison','Evans','Male','Math'),
('Amber ','Kumar','Female','Biology'),
('Sam','Anderson','Male','Chemistry'),
('Raul','Thatcher','Male','English');


insert into Pupil(PName, PSurname, PGender, PClass)
values
('Austin','Reeves','Male','6'),
('George','Diaz','Male','10'),
('Clare ','Walsh','Female','11'),
('Mack','Mcmillan','Male','4'),
('Charly','Perry','Female','9'),
('Mikey','Cherry','Female','12'),
('George','Bannister','Male','7'),
('Elsie ','Kearney','Female','8'),
('Harriette','Stone','Female','11'),
('George','Esquivel','Male','12');

insert into TeacherPupil(PupilId, TeacherId)
values
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(2,3),
(7,3),
(10,3),
(3, 5),
(4, 5),
(5, 5);

select distinct t.* from Teacher as t
inner join TeacherPupil TP on t.TeacherID = TP.TeacherId
inner join Pupil P on P.PupilID = TP.PupilId
where p.PName = 'George';
