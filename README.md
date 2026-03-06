# Pilha e Fila — Atividade

Este repositório contém dois projetos em Java para praticar estruturas de dados lineares:

- **Pilha (LIFO)**: simula um gerenciador de guias do navegador, com abertura, fechamento e reabertura de guias.
- **Fila (FIFO)**: simula uma fila de atendimento, com entrada, saída e consulta de elementos.

## Estrutura do projeto

```text
Pilha&Fila(atividade)/
├── pom.xml
└── src/main/java/br/com/
    ├── Pilha/
    │   ├── Main.java
    │   ├── Pilha.java
    │   ├── No.java
    │   └── No2.java
    └── Fila/
        ├── Programa.java
        ├── fila.java
        └── No.java
```

## Como executar

No diretório raiz do repositório:

```bash
cd "Pilha&Fila(atividade)"
mvn compile
```

### Executar projeto da Pilha

```bash
mvn exec:java -Dexec.mainClass="br.com.Pilha.Main"
```

### Executar projeto da Fila

```bash
mvn exec:java -Dexec.mainClass="br.com.Fila.Programa"
```

---

## BPMN — Projeto Pilha (Gerenciamento de guias)

```mermaid
flowchart TD
    A([Início]) --> B[Exibir menu de opções]
    B --> C{Opção escolhida}

    C -->|1 - Nova guia| D[Receber nome da guia]
    D --> E[Push na pilha de guias abertas]
    E --> B

    C -->|2 - Consultar guias abertas| F[Listar pilha de guias abertas]
    F --> B

    C -->|3 - Última guia aberta| G[Mostrar elemento do topo]
    G --> B

    C -->|4 - Fechar guia| H{Pilha aberta vazia?}
    H -->|Não| I[Pop da pilha aberta]
    I --> J[Push na pilha de guias fechadas]
    J --> B
    H -->|Sim| K[Informar: não há guias para fechar]
    K --> B

    C -->|5 - Reabrir guia fechada| L{Pilha de fechadas vazia?}
    L -->|Não| M[Pop da pilha fechada]
    M --> N[Push na pilha aberta]
    N --> B
    L -->|Sim| O[Informar: não há guias para reabrir]
    O --> B

    C -->|6 - Consultar guias fechadas| P[Listar pilha de guias fechadas]
    P --> B

    C -->|7 - Sair| Q([Fim])
```

## BPMN — Projeto Fila (Atendimento)

```mermaid
flowchart TD
    A([Início]) --> B[Exibir menu de atendimento]
    B --> C{Opção escolhida}

    C -->|1 - Adicionar item| D[Receber nome]
    D --> E[Enqueue no fim da fila]
    E --> B

    C -->|2 - Eliminar item| F{Fila vazia?}
    F -->|Não| G[Dequeue no início da fila]
    G --> B
    F -->|Sim| H[Informar: fila vazia]
    H --> B

    C -->|3 - Mostrar elementos| I[Listar fila do início ao fim]
    I --> B

    C -->|4 - Mostrar primeiro elemento| J{Fila vazia?}
    J -->|Não| K[Exibir elemento do início]
    K --> B
    J -->|Sim| L[Informar: fila vazia]
    L --> B

    C -->|5 - Verificar se está vazia| M{Fila vazia?}
    M -->|Sim| N[Exibir: fila vazia]
    N --> B
    M -->|Não| O[Exibir que há elementos e listar fila]
    O --> B

    C -->|6 - Sair| P([Fim])
```

## Conceitos aplicados

- **Pilha (LIFO)**: o último elemento inserido é o primeiro a sair.
- **Fila (FIFO)**: o primeiro elemento inserido é o primeiro a sair.
- **Nós encadeados** para representar dinamicamente os elementos.
