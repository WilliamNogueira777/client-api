# Client API

REST API for client management built with Spring Boot.

## Features

* CRUD de clientes
* Validação com Bean Validation
* Tratamento de exceções (404 e 422)

## Tecnologias

* Java
* Spring Boot
* JPA / Hibernate
* H2 Database

## Como rodar o projeto

```bash
mvn spring-boot:run
```

A API estará disponível em:

```
http://localhost:8080
```

## Endpoints principais

* GET /clients
* GET /clients/{id}
* POST /clients
* PUT /clients/{id}
* DELETE /clients/{id}

## Validações implementadas

* Nome não pode ser vazio
* Data de nascimento não pode ser futura

## Tratamento de erros

* 404 → Recurso não encontrado
* 422 → Erro de validação com mensagens por campo
