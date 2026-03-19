# 📚 bookstore-rest-api

API REST para gerenciamento de livros e editoras, desenvolvida com Java e Spring Boot seguindo boas práticas de arquitetura em camadas (Controller → Service → Repository).

---

## 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![JPA](https://img.shields.io/badge/JPA_/_Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![H2](https://img.shields.io/badge/H2_Database-003865?style=for-the-badge&logo=h2&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=for-the-badge&logo=lombok&logoColor=white)

---

## 🏗️ Arquitetura do Projeto

```
src/main/java/com/github/keyladayanaj/keyla_557630_mod1/
├── controller/
│   ├── EditoraController.java
│   └── LivroController.java
├── dto/
│   ├── EditoraDTO.java
│   ├── EditoraInputDTO.java
│   ├── EditoraResponseDTO.java
│   ├── LivroDTO.java
│   ├── LivroInputDTO.java
│   └── LivroResponseDTO.java
├── entities/
│   ├── Editora.java
│   └── Livro.java
├── repositories/
│   ├── EditoraRepository.java
│   └── LivroRepository.java
├── service/
│   ├── EditoraService.java
│   └── LivroService.java
└── Keyla557630Mod1Application.java

src/main/resources/
├── application.properties
├── application-test.properties
└── import.sql
```

---

## 🗂️ Modelo de Dados

```
Editora (1) ──────────── (N) Livro
  - id                         - id
  - nome                       - titulo
  - email                      - anoPublicacao
                               - isbn
                               - editora_id (FK)
```

> Uma editora publica vários livros. O relacionamento é `@OneToMany` em `Editora` e `@ManyToOne` em `Livro`.

---

## 📋 Endpoints

### Editora — `/editora`

| Método | Endpoint    | Descrição              | Status |
|--------|-------------|------------------------|--------|
| GET    | `/editora`  | Lista todas editoras   | 200 OK |
| POST   | `/editora`  | Cria uma nova editora  | 201 Created |

#### POST `/editora` — Body
```json
{
  "nome": "Companhia das Letras",
  "email": "contato@companhia.com"
}
```

#### Resposta
```json
{
  "id": 1,
  "nome": "Companhia das Letras",
  "email": "contato@companhia.com"
}
```

---

### Livro — `/livro`

| Método | Endpoint  | Descrição            | Status |
|--------|-----------|----------------------|--------|
| GET    | `/livro`  | Lista todos os livros | 200 OK |
| POST   | `/livro`  | Cria um novo livro   | 201 Created |

#### POST `/livro` — Body
```json
{
  "titulo": "Dom Casmurro",
  "anoPublicacao": 1899,
  "isbn": "978-8535902778",
  "editoraId": 1
}
```

#### Resposta
```json
{
  "id": 1,
  "titulo": "Dom Casmurro",
  "anoPublicacao": 1899,
  "isbn": "978-8535902778",
  "editoraNome": "Companhia das Letras"
}
```

---

## 🧪 Testando com Insomnia

Os endpoints foram testados com o Insomnia. Abaixo os prints de cada requisição:

### GET /editora
> Lista todas as editoras cadastradas no banco via `import.sql`

<img width="779" height="581" alt="image" src="https://github.com/user-attachments/assets/26b8c596-5b52-48d8-bcf9-1953f40d530b" />


---

### POST /editora
> Cria uma nova editora e retorna `201 Created` com o objeto salvo

<img width="771" height="247" alt="image" src="https://github.com/user-attachments/assets/8c6aca77-1afa-42b8-a331-fa1f10fe811f" />


---

### GET /livro
> Lista todos os livros com o nome da editora associada

<img width="770" height="498" alt="image" src="https://github.com/user-attachments/assets/0c14c875-d15f-4d00-aa4c-5b70ef4f9024" />


---

### POST /livro
> Cria um novo livro vinculado a uma editora existente pelo `editoraId`

<img width="773" height="285" alt="image" src="https://github.com/user-attachments/assets/adebca8a-c7a4-4910-acff-761213ef3eb5" />


---

## ▶️ Como executar

### Pré-requisitos
- Java 17+
- Maven

### Rodando o projeto

```bash
# Clone o repositório
git clone https://github.com/keyladayanaj/bookstore-rest-api.git

# Entre na pasta
cd bookstore-rest-api

# Execute
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 🗄️ Banco de dados

O projeto usa **H2 em memória** com dados pré-carregados via `import.sql`.

Acesse o console H2 em: `http://localhost:8080/h2-console`

| Campo    | Valor              |
|----------|--------------------|
| JDBC URL | `jdbc:h2:mem:testdb` |
| Usuário  | `sa`               |
| Senha    | *(em branco)*      |

### Tabela TB_EDITORA
<img width="772" height="426" alt="image" src="https://github.com/user-attachments/assets/5d2d33b3-00fb-4c16-b238-4f6baec8191f" />


### Tabela TB_LIVRO
<img width="778" height="348" alt="image" src="https://github.com/user-attachments/assets/1c4fb034-8808-4114-a7d1-d7d118127944" />


---

## 👩‍💻 Autora

Desenvolvido por **Keyla Dayana**  
Estudante de Sistemas de Informação — FIAP  
[![GitHub](https://img.shields.io/badge/GitHub-keyladayanaj-181717?style=flat&logo=github)](https://github.com/keyladayanaj/ms-produto)
