CREATE TABLE professores (
	id serial PRIMARY KEY,
	nome varchar(100),
	email varchar(100),
	telefone varchar(15) not null,
	dataNasc date
);

CREATE TABLE disciplinas (
	id serial PRIMARY KEY,
	nome varchar(100),
	cargaHoraria int, 
	maxParticipantes int,
	dataInicio date,
	id_professor int not null,
	FOREIGN KEY (id_professor) REFERENCES professores (id)
);