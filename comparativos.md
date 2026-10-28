# Comparativos entre padrões

Os exemplos são *exemplos adicionais* ao conteúdo da aula. Fonte conceitual: **Unidade 2 · Aula 3 — Prof. Nataniel Paiva**.

## Factory Method × Abstract Factory

| | Factory Method | Abstract Factory |
|---|---|---|
| Problema | Uma subclasse decide qual produto criar. | Um cliente precisa de uma família de produtos relacionados. |
| Mecanismo | Método de criação redefinido no Criador concreto. | Contrato com vários métodos de criação, implementado por uma fábrica concreta. |
| Exemplo | `LogisticaRodoviaria` decide criar um `Caminhao`. | `FabricaEscura` cria botão, caixa de texto e menu do tema escuro. |
| Escolha | Varia uma decisão de criação. | Varia a família inteira mantendo compatibilidade entre produtos. |

## Adapter × Facade

| | Adapter | Facade |
|---|---|---|
| Problema | Uma interface existente não é compatível com a esperada pelo cliente. | Um subsistema tem muitas operações para o caso de uso do cliente. |
| Mecanismo | Implementa a interface do cliente e traduz chamadas para o adaptado. | Oferece uma entrada simplificada e coordena as classes do subsistema. |
| Relação com o subsistema | Compatibiliza uma interface; não elimina o subsistema. | **Não esconde** as classes internas; clientes ainda podem usá-las diretamente. |

## Strategy × Template Method

| | Strategy | Template Method |
|---|---|---|
| Variação | Algoritmo inteiro é um objeto substituível, normalmente composto/injetado. | Subclasses redefinem etapas de um algoritmo cujo esqueleto é fixado na classe base. |
| Acoplamento | Composição; permite trocar estratégia em tempo de execução se o contexto permitir. | Herança; a sequência do método-base controla a execução. |
| Exemplo | Selecionar cálculo de frete sem `if` no checkout. | Importar arquivo seguindo abrir → ler → validar → salvar → fechar. |
| SOLID | Favorece OCP e composição. | Pode facilitar extensão, mas herança rígida pode dificultar variações independentes. |

## Notas de leitura

- Singleton centraliza acesso, mas cria estado global implícito e dificulta isolamento em testes. Em aplicações Spring, prefira dependências injetadas em beans singleton.
- Observer pode ser local e síncrono ou implementado com eventos do Spring; eventos não implicam, por si só, processamento assíncrono ou durabilidade.
- Command encapsula uma solicitação. `desfazer()` exige que a operação guarde ou consiga restaurar o estado anterior; não é automático.
