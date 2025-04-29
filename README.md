# Exercício de Lista Encadeada

Este projeto em Java implementa uma **lista encadeada simples** com as funcionalidades de inserção, remoção e visualização de elementos. O foco está em **demonstrar a remoção de um elemento específico** da lista por seu valor.

## Funcionalidades

- Inserir elementos no final da lista.
- Remover um elemento específico da lista escolhido pelo usuário.
- Exibir a lista atual.
- Interface de menu simples via console.

---

## Exemplo de Uso

Ao executar o programa, um menu interativo será exibido:

```
Boas-vindas!

Lista atual:
Lista: 20 21 35

Escolha sua opção:
[ 1 ] Remover um número
[ 2 ] Adicionar um número
[ 3 ] Sair
Sua opção: _
```

## Como Executar

1. Certifique-se de ter o Java instalado.
2. Execute a classe main

## Implementação

A classe `ListaEncadeada` contém:

- **Classe interna `No`**: representa cada elemento da lista.
- **Método `insere(int dado)`**: adiciona elemento ao final.
- **Método `remove(int numero)`**: remove o primeiro nó com o valor especificado.
- **Método `imprime()`**: exibe os elementos da lista.
- **Método `vazia()`**: verifica se a lista está vazia.
