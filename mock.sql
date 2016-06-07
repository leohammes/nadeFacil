SELECT * FROM CARD
SELECT * FROM IMAGE

--UPDATE CARD SET DESCRIPTION='Elas são ricas em vitaminas, minerais e fibras. Estas últimas proporcionam a sensação de saciedade e auxiliam o bom funcionamento do intestino.' WHERE ID = 2;
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