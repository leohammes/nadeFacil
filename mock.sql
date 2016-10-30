CREATE TABLE card(
	title varchar(50) NOT NULL,
	description text NOT NULL,
	image int NOT NULL,
	date date NOT NULL,
	id int auto_increment primary key not null,
	page_code int NULL,
	short_description text NULL
)

CREATE TABLE image(
	name varchar(50) NOT NULL,
	ID int auto_increment primary key NOT NULL,
	server_path varchar(50) NULL
)

create table users (
  user_name         varchar(15) not null primary key,
  user_pass         varchar(15) not null
);

create table user_roles (
  user_name         varchar(15) not null,
  role_name         varchar(15) not null,
  primary key (user_name, role_name)
);

insert into users (user_name, user_pass) values ('leonardo', 'l');
insert into user_roles (user_name, role_name) values ('leonardo', 'admin');

select date_format(now(), "d/m/y") from dual
SELECT * FROM CARD;
SELECT * FROM IMAGE;

DELETE FROM CARD WHERE ID = 1011;
DELETE FROM IMAGE WHERE ID = 1021;

UPDATE CARD SET SHORT_DESCRIPTION='Clique em leia mais e conheça toda a nossa história, desde o surgimento até agora.' WHERE ID = 8;
UPDATE CARD SET PAGE_CODE=5 WHERE ID = 7;

INSERT INTO IMAGE (name, server_path) values ('hidroginastica.jpg', '/image/')

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('Natação', 'Natação é a capacidade do homem e de outros animais de se deslocarem através de movimentos efetuados no meio líquido, geralmente sem ajuda artificial. A natação é uma atividade que pode ser simultaneamente útil e recreativa. As suas principais utilizações são recreativas, balneares, pesca, exercício e desporto.',
12, Convert(date, getdate()), 4);

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('Hidroginástica', 'A hidroginástica é um exercício aeróbico feito em piscinas que tem como objetivo a manutenção profilática da saúde. Melhora a capacidade aeróbica, a resistência cardiorespiratória, a resistência e a força muscular, a flexibilidade, além de proporcionar um gasto calórico de 260 a 400 kcal por hora dependendo da intensidade em que o praticante realiza os exercícios.',
14, Convert(date, getdate()), 5);

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('A Academia', 'A Nade Fácil academia atua na área dos esportes aquáticos, como por exemplo, natação e hidroginástica. Conta com uma equipe formada e super preparada para ajudar você a aprender ou aprimorar a habilidade de nadar. Sua piscina tem comprimento de 12,5m e as aulas intercalam entre natação e hidroginástica durante os dias da semana.',
13, Convert(date, getdate()), 4);