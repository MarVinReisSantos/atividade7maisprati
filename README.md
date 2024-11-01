# Gerenciador de Tarefas e Simulador com Listas Encadeadas e Filas em Java

## Descrição
Este repositório contém implementações de estruturas de dados em Java, como listas encadeadas e filas. Cada projeto exemplifica o uso prático dessas estruturas em diferentes cenários, como gerenciamento de tarefas, histórico de navegação, controle de ações "undo" e "redo" em um editor de texto, e simuladores de fila de atendimento.

## Projetos Incluídos
1. **Gerenciador de Tarefas** - Usa uma lista simplesmente encadeada para adicionar, remover e marcar tarefas como concluídas.
2. **Histórico de Navegação** - Simula o histórico de um navegador usando uma lista simplesmente encadeada.
3. **Editor de Texto (Undo e Redo)** - Implementa um sistema de "undo" e "redo" utilizando uma lista duplamente encadeada.
4. **Jogo de Cartas** - Gerencia a mão do jogador com uma lista duplamente encadeada, permitindo adicionar, remover e reorganizar cartas.
5. **Simulador de Fila de Banco** - Usa uma fila para gerenciar clientes em espera.
6. **Gerenciamento de Impressões** - Gerencia trabalhos de impressão em fila, processando-os na ordem de chegada.
7. **Fila de Processos** - Simula a fila de processos prontos para execução em um sistema operacional.

## Pré-requisitos
- **Java 11** ou superior
  - Faça o download em [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) ou [OpenJDK](https://openjdk.org/).
  - Verifique a instalação com o comando:
    ```bash
    java -version
    ```

## Como Clonar e Rodar os Projetos

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/usuario/ListaEncadeadaFilasJava.git
    ```

2. **Navegue até a pasta do projeto**:
    ```bash
    cd ListaEncadeadaFilasJava
    ```

3. **Compile o código**:
    ```bash
    javac -d bin src/*.java
    ```

4. **Execute o projeto**:
    ```bash
    java -cp bin NomeDoProjetoPrincipal
    ```

> Substitua `NomeDoProjetoPrincipal` pelo nome do arquivo principal de cada projeto.

## Funcionalidades por Projeto

### 1. Gerenciador de Tarefas
- Adicionar tarefa
- Remover tarefa
- Marcar tarefa como concluída

### 2. Histórico de Navegação
- Adicionar URL ao histórico
- Remover URL quando o histórico atinge o limite

### 3. Editor de Texto (Undo e Redo)
- Desfazer a última ação
- Refazer ação desfeita

### 4. Jogo de Cartas
- Adicionar carta à mão do jogador
- Remover carta específica
- Reorganizar cartas

### 5. Simulador de Fila de Banco
- Adicionar cliente à fila
- Atender próximo cliente

### 6. Gerenciamento de Impressões
- Adicionar trabalho de impressão
- Processar o próximo trabalho na fila

### 7. Fila de Processos
- Adicionar novo processo
- Executar o processo mais antigo

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## Licença
Distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para mais informações.

---

Este README fornece instruções completas para instalar, configurar e rodar cada projeto incluído no repositório.
