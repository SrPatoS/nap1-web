# nap1-web

API REST para controle de produtos.

## Pré-requisitos

- Java 17
- Maven
- Docker

## Como começar

### Usando Docker

Para subir o container da aplicação e o banco de dados PostgreSQL, execute o seguinte comando:

```bash
docker-compose up -d
```

A aplicação estará disponível em `http://localhost:8080`.

### Executando localmente

Para executar a aplicação localmente, primeiro inicie o banco de dados com o Docker:

```bash
docker-compose up -d postgres
```

Em seguida, execute a aplicação com o Maven:

```bash
./mvnw spring-boot:run
```

## Endpoints da API

| Método | Caminho      | Descrição                               |
|--------|--------------|-------------------------------------------|
| GET    | /produtos    | Lista todos os produtos.                  |
| POST   | /produtos    | Adiciona um novo produto.                 |
| GET    | /produtos/{id} | Busca um produto pelo ID.                 |
| PUT    | /produtos/{id} | Atualiza um produto existente.            |
| DELETE | /produtos/{id} | Deleta um produto.                        |

## Banco de dados

A aplicação utiliza um banco de dados PostgreSQL executando em um container Docker. As credenciais do banco de dados são:

- **Host**: localhost
- **Porta**: 5432
- **Banco de dados**: produto
- **Usuário**: admin
- **Senha**: 123

## Coleção do Postman

O arquivo `Produtos.postman_collection.json` contém uma coleção do Postman com exemplos de requisições para todos os endpoints da API.
