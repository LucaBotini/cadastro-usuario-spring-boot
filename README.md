# 🧑‍💻 cadastro-usuario-spring-boot

Projeto de estudos com **Spring Boot**, criado para colocar em prática um **CRUD completo** com **banco de dados em memória (H2)**.  
O objetivo é facilitar o aprendizado e aplicar os conceitos estudados de forma prática e realista.

---

## 🧩 Tecnologias Utilizadas

- ☕ **Java 23**
- 🌱 **Spring Boot**
- 🗃️ **Spring Data JPA**
- 🧰 **Lombok**
- 🧪 **H2 Database**
- 🧱 **Maven**

---

## ⚙️ Funcionalidades

- ✅ Cadastro de usuários  
- ✏️ Atualização de dados de usuários  
- 🔍 Consulta de todos os usuários por email e ID  
- ❌ Exclusão de usuários  
- 💾 Banco de dados em memória com H2  
- 🧠 Uso do Lombok para reduzir código boilerplate  

---

## 🧠 Entidade Principal

A aplicação trabalha com uma única entidade chamada **Usuário**, contendo os seguintes campos:

| Campo | Tipo  | Descrição             |
|-------|--------|-----------------------|
| `id`  | Long   | Identificador único   |
| `nome` | String | Nome do usuário       |
| `email` | String | E-mail do usuário     |

---

## ⚡ Como Executar o Projeto

### 🛠️ Pré-requisitos

- [Java 23](https://www.oracle.com/java/technologies/javase/23-relnote-issues.html)  
- [Maven 3.9+](https://maven.apache.org/)

---  

🗄️ Banco de Dados H2

A aplicação utiliza o banco H2 em memória para simplificar o desenvolvimento e testes.

Acesse o console em:
👉 http://localhost:8080/h2-console

Configurações padrão:

JDBC URL: jdbc:h2:mem:usuario

Usuário: sa

Senha: (em branco)

### ▶️ Passos para rodar

```bash
# Clonar o repositório
git clone https://github.com/seuusuario/cadastro-usuario-spring-boot.git

# Entrar na pasta do projeto
cd cadastro-usuario-spring-boot

# Compilar e rodar a aplicação
mvn spring-boot:run

A aplicação ficará disponível em:
👉 http://localhost:8080
