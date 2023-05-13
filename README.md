# Projeto DSList - Intensivão Java Spring Boot

### Visão geral do sistema

O projeto DSList é uma aplicação back-end que consiste em uma pesquisa de games, foi construída durante o evento Intensivão Java Spring, organizado pela [DevSuperior](https://www.youtube.com/@DevSuperior) com os seguintes objetivos:

- Aplicar conceitos (Sistemas web e recursos; Cliente/servidor, HTTP, JSON; Padrão REST para API web)
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão camadas
- Controller, service, repository
- Padrão DTO
- Relacionamentos N-N
- Classe de associação, embedded id
- Consultas SQL no Spring Data JPA
- Projections
- Perfis de projeto
- Ambiente local com Docker Compose
- Processo de homologação local
- Processo de deploy com CI/CD
- Configuração de CORS


### Ferramentas usadas:

- ``Java``
- ``Spring Boot``
- ``JPA/Hibernate``
- ``Maven``
- ``H2 Database``
- ``Docker``
- ``PostgreSQL``
- ``Postman``

### Progresso do sistema:

- [Criando o projeto](https://github.com/jurandi1/dslist/commit/aa9b6c44914ab0be3177a537257351bee1bebcc4) 
- [Properties, Game, ORM](https://github.com/jurandi1/dslist/commit/c91a6c28488b360308e488a1a5b494797a767860)
- [Game seed](https://github.com/jurandi1/dslist/commit/963429b413031e353b182a0b164fe6207148ab4c)
- [Game repository, Service, Controller](https://github.com/jurandi1/dslist/commit/088da857720fc4328ffd1ffc071f62370e34eccc)
- [Domain model](https://github.com/jurandi1/dslist/commit/1f0649ec0858abefc778d92d9904567ba3e48d73)
- [Database seed update](https://github.com/jurandi1/dslist/commit/8c293a9abc0c0154ae7d7d01bce0268066eafe7a)
- [GET game by id](https://github.com/jurandi1/dslist/commit/f0c9100c965fe30bb5d989184cf1457182d3ecd7)
- [GET lists](https://github.com/jurandi1/dslist/commit/f3aebdce44242b8612ef12928ae4ada06936cd6d)
- [SQL, projection, get games by list](https://github.com/jurandi1/dslist/commit/b17991ea12b559d1c07a291d9ed6627d911e4372)
- [Deploy ready](https://github.com/jurandi1/dslist/commit/7fcc04438040f800e1a7e3c92d56054521a7ea7b)
- [Homolog ok](https://github.com/jurandi1/dslist/commit/515532d1ce5b90d61e12e99d2acf2bb18ad36555)
- [CORS config](https://github.com/jurandi1/dslist/commit/19e472dd16335bb88adc83d3b8128b1da22920b5)
- [Move games on list](https://github.com/jurandi1/dslist/commit/827a70241b46f75c786857cb6d27f29b0b289fb4)

### Testes do projeto no H2

- TB_GAME_LIST

![DSList TB_GAME_LIST](https://github.com/jurandi1/dslist/assets/105133847/23ff08d8-f612-41fa-ae11-9b6f8b334119)

- TB_GAME

![DSList TB_GAME](https://github.com/jurandi1/dslist/assets/105133847/df3e41f2-1b23-47fe-9859-910b982a610b)

- TB_BELONGING

![DSList TB_BELONGING](https://github.com/jurandi1/dslist/assets/105133847/06e24a3f-3771-4391-9b28-8bfea84c275e)

### Testes do projeto no POSTEGRESQL

- TB_GAME_LIST

![PGADMIN_TB_GAME_LIST](https://github.com/jurandi1/dslist/assets/105133847/07984ad2-41d4-4a88-8c70-3ec179d432e2)

- TB_GAME

![PGADMIN_TB_GAME](https://github.com/jurandi1/dslist/assets/105133847/1f52a188-99a7-498a-9fe4-d283af8702c9)

- TB_BELONGING

![PGADMIN_TB_BELONGING](https://github.com/jurandi1/dslist/assets/105133847/31806ba9-7982-4fce-ada7-cc15a8965946)

### Testes do projeto no Postman

- GET GAMES

![get_games](https://github.com/jurandi1/dslist/assets/105133847/5add86c8-941f-48ae-b318-d0e98516d601)

- GET GAMES LISTS

![get_games_lists](https://github.com/jurandi1/dslist/assets/105133847/f5f5036e-1058-4f11-bfd2-753d1ace1584)

- GET GAMES BY LIST

![get_games_by_lists](https://github.com/jurandi1/dslist/assets/105133847/357f427c-0fa5-4a75-a096-01ae8a50e1ec)

- GET GAMES BY ID

![get_games_by_id](https://github.com/jurandi1/dslist/assets/105133847/bb6fefde-48aa-4b4a-88f1-835e202b62fd)

- POST LIST REPLACEMED

![post_list_replacemed](https://github.com/jurandi1/dslist/assets/105133847/1e7ae9a1-bd94-4215-9070-26ad1a68b77e)

### Desenvolvedor

[<img src="https://user-images.githubusercontent.com/105133847/215238362-763c8d76-55d2-4fd0-8b5f-f7080fbc4114.jpg" width=115><br><sub>Jurandi Junior</sub>](https://github.com/jurandi1)
