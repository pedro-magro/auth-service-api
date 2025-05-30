Markdown

# NailDesigner - API de Autenticação (Contrato)

Este projeto define o contrato da API (Data Transfer Objects - DTOs e a interface do Cliente Feign) para o `naildesigner-auth-service`. Ele serve como uma biblioteca compartilhada para garantir que o serviço de autenticação e seus consumidores (como o `naildesigner-bff`) "falem a mesma língua".

## Conteúdo Principal

Este artefato contém:

* **DTOs (Data Transfer Objects):** Localizadas no pacote `br.com.naildesigner.auth.api.dto`
    * `LoginRequest.java`: Dados para a solicitação de login.
    * `LoginResponse.java`: Dados retornados após um login bem-sucedido (contendo o token).
    * `RegisterRequest.java`: Dados para a solicitação de registro de um novo usuário.
* **Cliente Feign (Interface):** Localizada em `br.com.naildesigner.auth.api.client`
    * `AuthServiceClient.java`: Interface para consumo da API de autenticação via Feign.

## Como Usar

Para que outro serviço utilize este contrato de API, adicione a seguinte dependência ao `pom.xml` do serviço consumidor:

```xml
<dependency>
    <groupId>br.com.naildesigner</groupId>
    <artifactId>auth-service-api</artifactId>
    <version>0.0.1-SNAPSHOT</version> </dependency>
Como Construir (Build)
Para compilar esta biblioteca e instalá-la no seu repositório Maven local (para que outros projetos locais possam usá-la), navegue até a pasta raiz deste projeto e execute:

Bash

mvn clean install
Isso garantirá que as DTOs e a interface do cliente estejam disponíveis para os serviços que dependem desta API.



