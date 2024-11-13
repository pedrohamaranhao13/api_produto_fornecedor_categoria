-- CATEGORIAS
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Eletrônicos');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Games');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Eletrodomésticos');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Móveis');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Computadores');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Telefonia');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Câmeras e Filmadoras');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Acessórios');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Ar-Condicionado');
INSERT INTO tbl_categoria (id_pk, nome) VALUES (gen_random_uuid(), 'Peças e Ferramentas');
--FORNECEDORES
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Eletro', '01.111.111/0001-01');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Casas Bahia', '02.222.222/0001-02');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Ponto Frio', '03.333.333/0001-03');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Americanas', '04.444.444/0001-04');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Magazine Luiza', '05.555.555/0001-05');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Submarino', '06.666.666/0001-06');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Ricardo Eletro', '07.777.777/0001-07');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Carrefour', '08.888.888/0001-08');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Extra', '09.999.999/0001-09');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Lojas Pernambucanas', '10.000.000/0001-10');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid() 'Havan', '11.111.111/0001-11');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Leroy Merlin', '12.222.222/0001-12');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Alibaba', '13.333.333/0001-13');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'B2W Digital', '14.444.444/0001-14');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Fast Shop', '15.555.555/0001-15');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Ponto Frio', '16.666.666/0001-16');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Empório do Lar', '17.777.777/0001-17');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Tok&Stok', '18.888.888/0001-18');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Dell', '19.999.999/0001-19');
INSERT INTO tbl_fornecedor (id_pk, nome, cnpj) VALUES (gen_random_uuid(), 'Apple Store', '20.000.000/0001-20');

-- DESCRIÇÃO 
SELECT column_name, data_type, is_nullable
FROM information_schema.columns
WHERE table_name = 'tbl_produto';