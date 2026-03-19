-- Insere editoras primeiro (sem FK)
INSERT INTO tb_editora (nome, email) VALUES ('Pedro', 'pedro@gmail.com');
INSERT INTO tb_editora (nome, email) VALUES ('Gabriel', 'gabriel@gmail.com');
INSERT INTO tb_editora (nome, email) VALUES ('Diego', 'diego@gmail.com');
INSERT INTO tb_editora (nome, email) VALUES ('Keyla', 'keyla@gmail.com');
INSERT INTO tb_editora (nome, email) VALUES ('Lara', 'lara@gmail.com');

-- Insere livros com referência às editoras já existentes
INSERT INTO tb_livro (titulo, ano_publicacao, isbn, editora_id) VALUES ('A Jornada Perdida', 2020, 'ISBN-001', 1);
INSERT INTO tb_livro (titulo, ano_publicacao, isbn, editora_id) VALUES ('Sombras do Amanhã', 2021, 'ISBN-002', 2);
INSERT INTO tb_livro (titulo, ano_publicacao, isbn, editora_id) VALUES ('O Último Horizonte', 2022, 'ISBN-003', 3);