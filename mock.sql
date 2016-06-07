SELECT * FROM CARD
SELECT * FROM IMAGE

--UPDATE CARD SET DESCRIPTION='Elas s�o ricas em vitaminas, minerais e fibras. Estas �ltimas proporcionam a sensa��o de saciedade e auxiliam o bom funcionamento do intestino.' WHERE ID = 2;
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