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
('A Academia', 'A Nade F�cil academia atua na �rea dos esportes aqu�ticos, como por exemplo, nata��o e hidrogin�stica. Conta com uma equipe formada e super preparada para ajudar voc� a aprender ou aprimorar a habilidade de nadar. Sua piscina tem comprimento de 12,5m e as aulas intercalam entre nata��o e hidrogin�stica durante os dias da semana.',
13, Convert(date, getdate()), 4);

INSERT INTO CARD (title, description, image, date, page_code)
VALUES
('A Academia', 'A Nade F�cil academia atua na �rea dos esportes aqu�ticos, como por exemplo, nata��o e hidrogin�stica. Conta com uma equipe formada e super preparada para ajudar voc� a aprender ou aprimorar a habilidade de nadar. Sua piscina tem comprimento de 12,5m e as aulas intercalam entre nata��o e hidrogin�stica durante os dias da semana.',
13, Convert(date, getdate()), 4);