
![Programação-Conversor de Moedas - Challenge Especialização Back-End](https://github.com/user-attachments/assets/33deb8af-629e-47e1-96da-6db3bcbc91bf)

# Conversor de Moedas

Um conversor de moedas interativo que utiliza taxas de câmbio dinâmicas obtidas através da API [ExchangeRate](https://www.exchangerate-api.com). Este programa, desenvolvido em Programação Orientada a Objetos (POO), permite a conversão entre várias moedas de forma simples e eficiente.

## Sumário

- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Exemplo de Uso](#exemplo-de-uso)
## Funcionalidades

- Conversão entre as seguintes moedas:
  - Dólar (USD) para Peso Argentino (ARS)
  - Peso Argentino (ARS) para Dólar (USD)
  - Dólar (USD) para Real Brasileiro (BRL)
  - Real Brasileiro (BRL) para Dólar (USD)
  - Dólar (USD) para Peso Colombiano (COP)
  - Peso Colombiano (COP) para Dólar (USD)
  - Validação de entrada do usuário
  - Interface de console interativa

## Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java**
- **IntelliJ Idea** 
- **Gson** biblioteca para manipulação de JSON
- **API ExchangeRate** para obter taxas de câmbio

## Instalação

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu_usuario/conversor-de-moeda.git
   cd conversor-de-moeda
2. **Crie um arquivo `config.properties` na raiz do projeto com o seguinte conteúdo:**:
   ```bash
   api.key=Sua_Chave_Aqui
 #
 #### Como Obter sua Chave da API
  #### Para usar a API [ExchangeRate](https://www.exchangerate-api.com), você precisará de uma chave da API. Siga os passos abaixo:
  1. **Acesse o site da ExchangeRate API**.
  2. **Crie uma conta gratuita ou faça login se já tiver uma**.
  3. **Após a confirmação do e-mail, você receberá sua chave da API**.   
  4. **Insira essa chave no arquivo `config.properties` no formato indicado acima**. 
#
3. **Instalação da Biblioteca Gson**:
   ```bash
   Para utilizar a biblioteca Gson, você precisa adicioná-la ao seu projeto Java. Existem duas maneiras principais de fazer isso:

   Se você estiver usando Maven, adicione a seguinte dependência ao seu arquivo pom.xml:

   <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version> <!-- Substitua pela versão desejada -->
    </dependency>

   Se você não estiver usando Maven, pode baixar o arquivo JAR do Gson diretamente do MVN Repository:

   1. Acesse MVN Repository - https://mvnrepository.com/artifact/com.google.code.gson/gson

   2. Baixe o arquivo JAR correspondente à versão desejada. 

   3. Adicione o JAR ao classpath do seu projeto.

3. **Compile o projeto:**:
   ```bash
   javac -cp .:gson-2.11.0.jar src/*.java   
4. **Execute o programa:**:
   ```bash
   java -cp .:gson-2.11.0.jar Main   
## Como Usar

1. **Ao executar o programa, você verá um menu com opções de conversão**.
2. **Escolha uma opção digitando o número correspondente**.
3. **Insira a quantia que deseja converter**.   
4. **O programa exibirá o resultado da conversão**.
5. **Você pode optar por realizar outra conversão ou sair do programa**.

## Exemplo de Uso
```bash
************************************
*      CONVERSOR DE MOEDAS         
************************************
*   Bem-vindo ao Conversor de Moedas   
************************************

Escolha uma conversão:

1. Dólar [USD] => Peso argentino [ARS]
2. Peso argentino [ARS] => Dólar [USD]
3. Dólar [USD] => Real brasileiro [BRL]
4. Real brasileiro [BRL] => Dólar [USD]
5. Dólar [USD] => Peso colombiano [COP]
6. Peso colombiano [COP] => Dólar [USD]
7. Sair

Digite o número da opção: 1
Digite a quantia: 100
100.00 [USD] é igual a 10000.00 [ARS]

Deseja fazer outra conversão? (1 - Sim, 0 - Não): 0
Encerrando programa...


Explicação do README

**Título e Descrição**: Um título claro e uma breve descrição do que é o projeto.

**Estrutura do Projeto**: Uma visão geral das classes principais que compõem o sistema.

**Funcionalidades**: Lista das funcionalidades disponíveis no programa.

**Pré-requisitos**: Informações sobre as dependências necessárias para executar o projeto.

**Instalação**: Passos detalhados sobre como clonar, compilar e executar o projeto.

**Como Usar**: Instruções sobre como usar o programa, incluindo exemplos práticos.

**Exemplo de Uso**: Um exemplo claro da interação do usuário com o programa.
