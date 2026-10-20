# API REST

API REST desenvolvida com Java e Spring Boot, com foco na construção de serviços HTTP, organização em camadas, boas práticas de desenvolvimento e testes automatizados.

O projeto faz parte da minha jornada de aprendizado em desenvolvimento backend, com foco na construção de APIs robustas, testáveis e bem documentadas.

## Tecnologias

- **Java** — linguagem de programação.
- **Spring Boot** — desenvolvimento da aplicação backend.
- **Spring Web** — criação de endpoints HTTP REST.
- **Spring REST Docs** — documentação da API a partir de testes automatizados.
- **JUnit** — testes automatizados.
- **Gradle** — gerenciamento de dependências e execução do build.
- **AsciiDoc** — escrita da documentação técnica.

> As tecnologias e versões devem ser conferidas no `build.gradle` antes da publicação.

## Funcionalidades

As funcionalidades devem corresponder aos recursos implementados no projeto. A estrutura pode contemplar:

- Exposição de endpoints REST.
- Recebimento e retorno de dados em JSON.
- Validação de dados de entrada.
- Tratamento de códigos de resposta HTTP.
- Testes automatizados dos endpoints.
- Geração de documentação técnica com Spring REST Docs.

## Pré-requisitos

Antes de executar o projeto, verifique se você possui:

- JDK compatível com a versão configurada no projeto.
- Git.
- IntelliJ IDEA ou outra IDE compatível com Java.
- Gradle Wrapper incluído no repositório.

## Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/JeffersonTeodoro/API-REST.git
```

### 2. Entre na pasta do projeto

```bash
cd API-REST
```

### 3. Execute os testes

No Windows, utilizando PowerShell:

```powershell
.\gradlew.bat test
```

No Linux ou macOS:

```bash
./gradlew test
```

### 4. Execute a aplicação

Se o projeto utilizar o plugin Spring Boot para Gradle:

```powershell
.\gradlew.bat bootRun
```

A porta e os endereços dos endpoints dependem da configuração da aplicação.

## Documentação da API

A documentação técnica pode ser escrita em AsciiDoc e complementada pelos snippets gerados pelo Spring REST Docs durante os testes.

Arquivo-fonte esperado:

```text
src/docs/asciidoc/index.adoc
```

### Gerar a documentação HTML

Se a tarefa `asciidoctor` estiver configurada no projeto, execute:

```powershell
.\gradlew.bat asciidoctor
```

O HTML geralmente é gerado em:

```text
build/docs/asciidoc/index.html
```

Abra esse arquivo no Google Chrome para visualizar a documentação formatada.

**Observação:** a tarefa, o caminho de saída e os snippets dependem da configuração do `build.gradle` e dos testes existentes.

## Testes automatizados

Os testes ajudam a verificar o comportamento dos endpoints e a identificar regressões durante a evolução da aplicação.

Para executar a suíte de testes:

```powershell
.\gradlew.bat test
```

Consulte os resultados gerados pelo Gradle para verificar a quantidade de testes executados e eventuais falhas.

## Estrutura do projeto

A organização exata depende da implementação atual. Uma estrutura possível para uma aplicação Spring Boot é:

```text
API-REST/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   ├── test/
│   │   └── java/
│   └── docs/
│       └── asciidoc/
│           └── index.adoc
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
└── README.md
```

## Boas práticas aplicadas

- Separação de responsabilidades.
- Organização do código em camadas, quando aplicável.
- Testes automatizados.
- Documentação técnica.
- Uso de ferramentas do ecossistema Java e Spring.

## Objetivos de aprendizado

Este projeto contribui para o desenvolvimento de conhecimentos em:

- Desenvolvimento de APIs REST com Java.
- Spring Boot e Spring Web.
- Testes de integração.
- Documentação de contratos HTTP.
- Automação de builds com Gradle.
- Boas práticas de engenharia de software.

## Autor

**Jefferson França Teodoro**

- GitHub: [@JeffersonTeodoro](https://github.com/JeffersonTeodoro)
- Repositório: [API-REST](https://github.com/JeffersonTeodoro/API-REST)

---

Projeto desenvolvido para fins de aprendizado e evolução profissional em desenvolvimento backend Java.
