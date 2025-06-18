Segue uma versão melhorada, com correções de ortografia, instruções mais claras e formatação aprimorada:

```markdown
## API de Produtos com Spring Boot e PostgreSQL

### Instruções

1. Clone o repositório:
   ```bash
   git clone https://github.com/SrPatoS/nap1-web.git
   cd nap1-web
   ```

2. Certifique-se de ter o **JDK** e o **Docker** instalados em sua máquina.

3. Instale as dependências do projeto:
   ```bash
   ./mvnw clean install
   ```

4. Inicie o banco de dados PostgreSQL com Docker Compose:
   ```bash
   docker compose up -d
   ```

5. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

Pronto! A API estará disponível para uso.
### Endpoints Disponíveis
- `GET /produtos`: Retorna todos os produtos.
- `GET /produtos/{id}`: Retorna um produto específico pelo ID.
- `POST /produtos`: Cria um novo produto.
- `PUT /produtos/{id}`: Atualiza um produto existente pelo ID.
- `DELETE /produtos/{id}`: Remove um produto pelo ID.