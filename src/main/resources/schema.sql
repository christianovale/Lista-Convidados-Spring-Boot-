DROP TABLE IF EXISTS convidados;
 
CREATE TABLE IF NOT EXISTS convidados (
  id              INT     NOT NULL PRIMARY KEY,
  name       	  VARCHAR(200),
  email          VARCHAR(200),
  telefone       VARCHAR(200),
);