# FórumHub: Sua API REST para Gerenciamento de Fóruns

## Sobre o Projeto

O FórumHub é uma API RESTful criada como parte do Desafio Back End da Alura. Nosso objetivo com este projeto é simular as operações de um fórum online, permitindo que você gerencie tópicos de forma completa – desde a criação até a exclusão.

### O Que a API Pode Fazer

Construída com o **Spring Framework**, esta API oferece as seguintes capacidades essenciais:

* **Publicar um novo tópico:** Crie discussões e perguntas no fórum.
* **Visualizar todos os tópicos:** Acesse uma lista completa de todas as conversas existentes.
* **Consultar um tópico individual:** Obtenha os detalhes de qualquer tópico usando seu identificador único.
* **Modificar um tópico existente:** Edite o conteúdo de tópicos que já foram criados.
* **Remover um tópico:** Delete tópicos do fórum de forma definitiva.

---

### Tecnologias Principais

Para desenvolver o FórumHub, utilizamos as seguintes ferramentas:

* **Spring Boot:** A base do nosso desenvolvimento de API, proporcionando agilidade e robustez.
* **Hibernate:** Usado para mapear objetos do nosso código diretamente para o banco de dados.
* **MySQL:** O sistema de gerenciamento de banco de dados escolhido para armazenar todas as informações do fórum.
* **Spring Security:** Garante a segurança da API, lidando com a autenticação e autorização dos usuários.

---

### Organização do Código

O projeto está dividido em camadas para uma melhor organização e manutenção:

* **Controller:** Responsável por receber as requisições web e direcioná-las.
* **Repository:** Cuida de toda a interação com o banco de dados.
* **Model:** Define como os dados são estruturados e armazenados.
* **DTO (Data Transfer Object):** Facilita a passagem de dados entre as diferentes partes da aplicação.

---

### Como Contribuir

Ficou interessado em ajudar? Suas contribuições são muito bem-vindas! Sinta-se à vontade para abrir **issues** (para relatar problemas ou sugerir melhorias) e enviar **pull requests** (com suas modificações de código).
