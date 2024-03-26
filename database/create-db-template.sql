CREATE TABLE produto(produtoid INT NOT NULL AUTO_INCREMENT, produtonome VARCHAR(100)NOT NULL, produtomarca VARCHAR(100)NOT NULL, produtotamanho VARCHAR(100)NOT NULL, produtoitensinclusos VARCHAR(100)NOT null, produtovalor DECIMAL(5,2)NOT NULL, PRIMARY KEY(produtoid));
SHOW TABLES
INSERT INTO produto(produtonome, produtomarca, produtotamanho, produtoitensinclusos, produtovalor) VALUES ('PS4', 'SONY', 'Medio', '2 controles e 2 CDs de jogos', 355.99);
INSERT INTO produto(produtonome, produtomarca, produtotamanho, produtoitensinclusos, produtovalor) VALUES('PS4', 'Sony', 'Medio', '2 cabos', 235.65)
INSERT INTO produto(produtonome, produtomarca, produtotamanho, produtoitensinclusos, produtovalor) VALUES('Fone de ouvido', 'Hyperx', 'Medio', '1 cabos', 399.65);
INSERT INTO produto(produtonome, produtomarca, produtotamanho, produtoitensinclusos, produtovalor) VALUES('Trakinas', 'Nestle', 'Pequeno', '-', 2.99);
INSERT INTO produto(produtonome, produtomarca, produtotamanho, produtoitensinclusos, produtovalor) VALUES('chinelo', 'Havaianas', 'grande', '-', 20.70);


SELECT *FROM produto;
SELECT produtoid, produtonome from produto;
SELECT produtoid as id, produtonome nome FROM produto;
SELECT* FROM produto ORDER BY produtonome ASC;
SELECT* FROM produto ORDER BY produtonome DESC;
SELECT* FROM produto ORDER BY RAND();
SELECT* FROM produto ORDER BY produtomarca ASC LIMIT 1;
SELECT* FROM produto ORDER BY produtonome ASC LIMIT 1;
SELECT* FROM produto;
SELECT* FROM produto WHERE produtoid = 5;
SELECT* FROM produto WHERE produtoid = 5 or produtoid = 2;
SELECT* FROM produto WHERE produtoid in (5, 2);

SELECT* FROM produto WHERE produtonome = 'PS4' and produtoid = 1;
SELECT* FROM produto WHERE produtonome = 'PS4' and produtovalor < 500;
SELECT* FROM produto WHERE produtonome LIKE 't%';
SELECT* FROM produto WHERE produtonome LIKE '%s%';
CREATE TABLE itemincluso(iteminclusoid INT NOT NULL AUTO_INCREMENT, iteminclusonome VARCHAR (200)NOT NULL, PRIMARY KEY (iteminclusoid));
SHOW TABLES;
DESCRIBE itemincluso;
ALTER TABLE itemincluso ADD produtoid INT NOT NULL;
ALTER TABLE itemincluso ADD iteminclusoquantidade INT NOT NULL;
DESCRIBE itemincluso
SELECT* FROM produto;
INSERT INTO itemincluso (iteminclusonome, produtoid, iteminclusoquantidade) VALUES ('Controles', 1, 2);
INSERT INTO itemincluso (iteminclusonome, produtoid, iteminclusoquantidade) VALUES ('CDs de jogos', 1, 2);
SELECT* from itemincluso;
INSERT INTO itemincluso (iteminclusonome, produtoid, iteminclusoquantidade) VALUES ('cabos', 2, 2);
SELECT* FROM itemincluso;
INSERT INTO itemincluso (iteminclusonome, produtoid, iteminclusoquantidade) VALUES ('cabos', 5, 1);
SELECT* FROM itemincluso;
DESCRIBE produto;
ALTER TABLE produto DROP COLUMN produtoitensinclusos;
DESCRIBE produto;
SELECT* FROM produto JOIN itemincluso ON itemincluso.produtoid = produto.produtoid;
SELECT* FROM produto LEFT JOIN itemincluso ON itemincluso.produtoid = produto.produtoid;
UPDATE produto SET produtonome = 'Playstation 4' WHERE produtoid = 1;
SELECT* FROM produto;
UPDATE produto SET produtonome = 'Playstation 4' WHERE produtoid = 2;
SELECT* FROM produto;
UPDATE produto SET produtonome = 'XBOX', produtomarca = 'Microsoft' WHERE produtoid = 2;
SELECT* FROM produto;
DELETE FROM produto WHERE produtoid = 1;
