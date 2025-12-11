Projeto Jogadores – API + Front-end

Projeto desenvolvido individualmente por Murilo Sakaue, na disciplina Object Oriented Programming, para colocar em prática conceitos de POO, desenvolvimento de APIs REST com Spring Boot e consumo de API no Front-end.

🚀 Tecnologias Utilizadas
Backend (API REST)

Java 24

Spring Boot 3.3.2

Maven

Jackson

IntelliJ IDEA

Frontend

HTML5

CSS3

JavaScript (Fetch API)

🏗️ Arquitetura do Projeto
projeto-jogadores/
│
├── backend/      → API REST em Spring Boot
├── frontend/     → Interface Web consumindo a API
└── README.md     → Documentação principal

📌 Funcionalidades da API

Listar jogadores

Buscar por ID

Dados carregados automaticamente via JSON

Armazenamento em memória usando List

Estrutura orientada a objetos completa

🎨 Funcionalidades do Front-End

Interface moderna e responsiva

Listagem dos jogadores consumindo o endpoint /api/v1/jogadores

Visualização limpa e organizada

📂 Backend — Como rodar
cd backend
mvn spring-boot:run


A API rodará em:
👉 http://localhost:8080/api/v1/jogadores

🌐 Frontend — Como rodar

Abra o arquivo:

frontend/index.html


Ou utilize um servidor simples:

cd frontend
npx live-server

📁 Organização Orientada a Objetos

A classe Jogador possui:

10+ atributos

Getters e setters

Método toString sobrescrito

Boa prática de encapsulamento

🧠 Objetivo Acadêmico

Esse projeto foi desenvolvido para consolidar:

Criação de classes e objetos

Encapsulamento

Camadas (model / controller)

Endpoints REST

Consumo de API no front-end

Manipulação de listas em memória

