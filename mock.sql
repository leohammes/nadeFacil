SELECT * FROM CARD;
SELECT * FROM IMAGE;

DELETE FROM CARD WHERE ID = 1011;
DELETE FROM IMAGE WHERE ID = 1021;

UPDATE CARD SET SHORT_DESCRIPTION='Clique em leia mais e conhe�a toda a nossa hist�ria, desde o surgimento at� agora.' WHERE ID = 8;
UPDATE CARD SET PAGE_CODE=5 WHERE ID = 7;

INSERT INTO IMAGE (name, server_path) values ('hidroginastica.jpg', '/image/')

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('Nata��o', 'Nata��o � a capacidade do homem e de outros animais de se deslocarem atrav�s de movimentos efetuados no meio l�quido, geralmente sem ajuda artificial. A nata��o � uma atividade que pode ser simultaneamente �til e recreativa. As suas principais utiliza��es s�o recreativas, balneares, pesca, exerc�cio e desporto.',
12, Convert(date, getdate()), 4);

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('Hidrogin�stica', 'A hidrogin�stica � um exerc�cio aer�bico feito em piscinas que tem como objetivo a manuten��o profil�tica da sa�de. Melhora a capacidade aer�bica, a resist�ncia cardiorespirat�ria, a resist�ncia e a for�a muscular, a flexibilidade, al�m de proporcionar um gasto cal�rico de 260 a 400 kcal por hora dependendo da intensidade em que o praticante realiza os exerc�cios.',
14, Convert(date, getdate()), 5);

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('A Academia', 'A Nade F�cil academia atua na �rea dos esportes aqu�ticos, como por exemplo, nata��o e hidrogin�stica. Conta com uma equipe formada e super preparada para ajudar voc� a aprender ou aprimorar a habilidade de nadar. Sua piscina tem comprimento de 12,5m e as aulas intercalam entre nata��o e hidrogin�stica durante os dias da semana.',
13, Convert(date, getdate()), 4);


create table users (
  user_name         varchar(15) not null primary key,
  user_pass         varchar(15) not null
);

create table user_roles (
  user_name         varchar(15) not null,
  role_name         varchar(15) not null,
  primary key (user_name, role_name)
);

insert into users (user_name, user_pass) values ('leonardo', '@123leo');
insert into user_roles (user_name, role_name) values ('leonardo', 'admin');