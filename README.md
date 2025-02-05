# Gerenciador de Produtos

## Descrição
Este projeto Java tem como objetivo criar um sistema básico para gerenciar informações de produtos, categorizando-os em produtos comuns, importados e usados. A aplicação utiliza os princípios da programação orientada a objetos para modelar os diferentes tipos de produtos e suas características.

## Tecnologias Utilizadas
* **Java:** Linguagem de programação utilizada para desenvolver o projeto.
* **Orientação a Objetos:** Paradigma de programação utilizado para modelar o problema, utilizando classes, objetos, herança e polimorfismo.

## Estrutura do Projeto
* **Entities:**
  * `Product`: Classe base que representa um produto genérico com atributos como nome e preço.
  * `ImportedProduct`: Classe que herda de `Product` e adiciona o atributo `customsFee` para representar produtos importados.
  * `UsedProduct`: Classe que herda de `Product` e adiciona o atributo `manufactureDate` para representar produtos usados.
* **Main:**
  * Classe principal que contém o método `main` para executar a aplicação. Lê os dados dos produtos a partir do console e imprime as etiquetas de preço.

## Metodologias de Orientação a Objetos Utilizadas
* **Herança:**
  * As classes `ImportedProduct` e `UsedProduct` herdam da classe `Product`, permitindo a reutilização de código e a criação de uma hierarquia de classes.
* **Polimorfismo:**
  * O método `priceTag()` é sobrecarregado nas classes filhas (`ImportedProduct` e `UsedProduct`) para fornecer uma representação textual personalizada para cada tipo de produto.
* **Encapsulamento:**
  * Os atributos das classes são privados e acessados através de métodos getters e setters, controlando o acesso aos dados.
* **Abstração:**
  * A classe `Product` representa um conceito abstrato de produto, enquanto as classes filhas representam tipos mais específicos de produtos.

## Como Executar
1. **Clonar o repositório:**
   ```bash
   git clone [URL do projeto]
