# 🛠️ Microservices na Prática

Este repositório contém o código-fonte do **User Microservice**, parte de uma série de vídeos educacionais que demonstram como construir e integrar **microservices** utilizando práticas modernas de desenvolvimento com **Java 21** e **Spring Boot**.

## 📝 Descrição

O projeto **User Microservice** é desenvolvido em conjunto com o **Email Microservice**, ambos implementando comunicação assíncrona através de mensageria com **RabbitMQ**. Através deste repositório, você aprenderá a:

- **Construir microservices** do zero com foco em escalabilidade e manutenibilidade utilizando **Spring Boot**.
- **Implementar comunicação assíncrona** entre microservices usando **RabbitMQ**, permitindo a troca eficiente de mensagens entre serviços.
- **Enviar e-mails** de forma programática utilizando o **SMTP** do Gmail, demonstrando como integrar serviços externos.
- **Gerenciar filas de mensagens**, lidando com casos de uso real de mensageria em aplicações distribuídas.
- **Explorar arquiteturas de software** que suportam o crescimento e a complexidade de aplicações modernas.

## 📂 Conteúdo

- **User Microservice**: Responsável pela gestão de usuários, incluindo cadastro, autenticação, e manutenção de perfis.
- **Email Microservice**: Focado no envio de notificações e emails transacionais utilizando serviços SMTP.
- **Comunicação Assíncrona**: Configuração e uso do **RabbitMQ** para troca de mensagens entre microservices.
- **Integração com Gmail**: Implementação do envio de emails utilizando o serviço SMTP do Gmail para demonstrar a interação com serviços de email.

## 🚀 Como Usar

### Pré-requisitos

- **Java 21**: Certifique-se de que o Java 21 está instalado na sua máquina. [Baixe aqui](https://jdk.java.net/21/).
- **Maven**: Utilize o Maven para gerenciamento de dependências. [Instale o Maven](https://maven.apache.org/install.html).
- **RabbitMQ**: Certifique-se de que o RabbitMQ está em execução. Você pode usar o Docker para iniciar uma instância local.

  ```bash
  docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management



## ... EM CONSTRUCAO ...
 

### Notas Adicionais

1. **Java 21 e Spring Boot**: O texto foi ajustado para refletir o uso de Java 21 e Spring Boot, que são ferramentas populares para desenvolver microservices robustos em Java.

2. **Maven**: O uso do Maven para gerenciamento de dependências foi incluído, visto que é uma prática comum em projetos Java.

3. **Docker para RabbitMQ**: O exemplo usa Docker para facilitar a execução do RabbitMQ localmente. Isso pode ser útil para desenvolvedores que preferem uma configuração rápida e descartável.

4. **Configuração de SMTP e RabbitMQ**: Adicionei exemplos de como configurar o `application.properties` para conectar-se ao RabbitMQ e enviar e-mails com o Gmail SMTP.

5. **Links e Recursos**: Forneci links diretos para baixar Java 21 e instalar o Maven, o que pode ajudar novos desenvolvedores a começar mais rapidamente.

Se você precisar de mais ajustes ou tiver outras perguntas, fique à vontade para perguntar!
