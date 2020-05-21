CREATE TABLE professores (
	id serial PRIMARY KEY,
	nome varchar(100),
	email varchar(100),
	telefone varchar(15),
	dataNasc date
);

CREATE TABLE disciplinas (
	id serial PRIMARY KEY,
	nome varchar(100),
	cargaHoraria SMALLINT,
	maxParticipantes int,
	dataInicio date,
	id_professor int,
	FOREIGN KEY (id_professor) REFERENCES professores (id)
);