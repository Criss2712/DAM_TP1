# Assignment 1 — Hello Kotlin. Hello Android World!
<!-- Replace X and Title -->

Course: Desenvolvimento de Aplicações Móveis (DAM)

Student(s): Renata Cristina Conceição Góis

Date: 

Repository URL: https://github.com/Criss2712/DAM_TP1

---
## 1. Introduction
<!-- Purpose of the assignment, problem description, and objectives. -->

Este primeiro trabalho prático teve como objetivo dar a introduzir aos alunos a nova linguagem de programação Kotlin e ao
desenvolvimento em Android com base no IDE Android Studio. O trabalho encontra-se dividido em diferentes secções.
Primeiro são apresentados alguns exercícios para os alunos interagirem com Kotlin, de seguida procede-se à preparação do
ambiente do Android Studio, e por fim retorna-se à linguagem Kotlin mas desta vez com a introdução da programação orientada
a objetos.

Neste repositório apresentar-se-à apenas os exercícios dedicados ao Kotlin, tendo cada aplicação Android o seu próprio 
repositório.

## 2. System Overview
<!-- High-level description of the solution, main features, and use cases. -->

### Exercício 1: Quadrados Perfeitos
**Descrição Geral:**  
Programa em Kotlin que cria e inicializa um array com os primeiros 50 quadrados perfeitos (1² a 50²) utilizando três abordagens diferentes: construtor `IntArray`, range com `map()`, e construtor `Array`.

**Funcionalidades Principais:**
- Geração dinâmica de quadrados perfeitos
- Três implementações distintas para demonstrar diferentes conceitos da linguagem
- Comparação entre arrays primitivos (`IntArray`) e arrays de objetos (`Array<Int>`)

**Casos de Uso:**
- **Demonstração de construtores:** O programador pode observar como inicializar arrays com lambdas
- **Demonstração de programação funcional:** Uso de `range` e `map` para transformação de dados

### Exercício 2: Calculadora em Consola
**Descrição Geral:**  
Calculadora interativa em consola que suporta operações aritméticas, booleanas e binárias. 
O programa demonstra o uso de `when`, tratamento de exceções, e formatação de strings.

**Funcionalidades Principais:**
- Operações aritméticas: adição, subtração, multiplicação, divisão
- Operações booleanas: AND (&&), OR (||), NOT (!)
- Operações binárias: left shift (shl), right shift (shr)
- Validação de input com tratamento de exceções
- Apresentação de resultados em decimal, hexadecimal e booleano

**Casos de Uso:**
- **Cálculo aritmético:** Utilizador escolhe uma operação (+, -, *, /), insere dois números e obtém o resultado.
- **Operação lógica:** Utilizador escolhe uma operação booleana, insere valores (0 para false, !=0 para true) e obtém o resultado lógico.
- **Operação binária:** Utilizador escolhe shl ou shr, insere dois inteiros e obtém o resultado da deslocação de bits.
- **Tratamento de erros:** Se o utilizador inserir texto em vez de números, o programa pede novamente o input.


### Exercício 6: Biblioteca Virtual 
**Descrição Geral:**  
Sistema de gestão de biblioteca virtual desenvolvido em Kotlin, aplicando conceitos de programação orientada a objetos: 
classes abstratas, herança, polimorfismo, encapsulamento, e métodos abstratos.

**Funcionalidades Principais:**
- **Hierarquia de classes:** `Book` (abstrata), `DigitalBook` e `PhysicalBook` (subclasses).
- **Propriedades personalizadas:** Getter para classificação por época (Classic/Modern/Contemporary), 
setter com validação para cópias disponíveis.
- **Método abstrato:** `getStorageInfo()` implementado em cada subclasse.
- **Gestão de coleção:** Classe `Library` com métodos para adicionar, emprestar, devolver, listar e pesquisar livros.
- **Companion object:** Contador global de livros adicionados.
- **Data class:** `LibraryMember` para representar membros da biblioteca.

**Casos de Uso:**
- **Adicionar livro:** O sistema regista um novo livro (físico ou digital) na biblioteca.
- **Emprestar livro:** Utilizador requisita um livro; se disponível, o stock é decrementado.
- **Devolver livro:** Utilizador devolve um livro; o stock é incrementado.
- **Listar catálogo:** Visualização de todos os livros com detalhes específicos do formato.
- **Pesquisar por autor:** Listagem de livros de um determinado autor.


## 3. Architecture and Design
<!-- Architecture, folder structure, design patterns, and justification of key
    decisions. -->

A estrutura do projeto segue a organização sugerida no enunciado do trabalho prático para organizar os ficheiros `.kt`:

- `dam.exer_1`: Pacote que contém o Exercício 1: Quadrados Perfeitos;
- `dam.exer_2`: Pacote que contém o Exercício 2: Calculadora em Consola;
- `dam.exer_3`: Pacote que contém o Exercício 3: Geração de uma Sequência de Saltos de uma bola (não foi implementado); 
- `dam.exer_vl`: Pacote que contém o Exercício 6: Sistema de Biblioteca Virtual;


## 4. Implementation
<!-- Implementation details: main modules, components, algorithms, and relevant code
    excerpts. -->

### Exercício 1: Quadrados Perfeitos
Sendo um exercício direto não apresenta grandes implementações, logo não existe informação relevante a adicionar, pois
o necessário já foi apresentado, e o restante encontra-se implementado no ficheiro.

Documentação Kotlin:
- `Arrays:` https://kotlinlang.org/docs/arrays.html


- `Control Flow (Ranges):` https://kotlinlang.org/docs/control-flow.html#ranges


- `Collection Transformation Operations (Map):` https://kotlinlang.org/docs/collection-transformations.html


### Exercício 2: Calculadora em Consola
Este exercício, ao contrário do anterior, revelou-se ser mais extenso. Para a realização de uma calculadora
em consola foram implementados vários menus interligados que apresentam ao utilizador as várias opções que podem ser realizadas
nesta calculadora. 

Toda a calculadora se encontra dentro de um ciclo `while(true)` principal para que seja possível, após a realização de uma
operação, voltar ao menu principal e, ou voltar a escolher uma nova operação, ou sair da calculadora.

Dentro deste ciclo principal, cada menu posteriormente apresentado encontra-se dentro do seu próprio ciclo `while(true)`
com o objetivo de controlar inputs inválidos, ou seja, se for introduzido algo inválido, o utilizador é informado e o menu
é apresentado novamente.

A verificação da introdução de valores numéricos é realizada com blocos `try-catch` com a exceção `e:NumberFormatException`.

A realização das operações da calculadora são realizadas com recurso à instrução `when` do Kotlin, em que com base no operador
escolhido, é realizada a operação correspondente.

Documentação Kotlin:
- `Control Flow:` https://kotlinlang.org/docs/control-flow.html

<!--### Exercício 3: Sequência de Saltos-->

### Exercício 6: Sistema de Biblioteca Virtual
Neste exercício introduz-se a programação orientada a objetos na linguagem Kotlin, ao ser pedido para se implementar
uma biblioteca virtual com as seguintes classes:

- `Book`: Classe abstrata com as suas próprias propriedades referentes aos atributos normais de um livro (título, autor,
ano publicação, etc.);
- `DigitalBook` e `PhysicalBook`: Subclasses da classe `Book` com novas propriedades próprias a cada uma e com a implementação 
do método abstrato `getStorageInfo()` declarado na classe `Book`;
- `Library`: Classe que funciona como "manager" que contém os métodos para adicionar, requisitar, devolver, apresentar e
procurar livros;
- `Main.kt`: Ficheiro kotlin que contém a função main em que é executada a biblioteca virtual. São criados novos objetos
dos vários tipos de livros (digital e physical), e são testadas algumas das funções. O código presente neste ficheiro foi 
fornecido aos alunos, estando disponível no enunciado do trabalho.

Documentação Kotlin:
- `find()`: https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html
  - Retorna o primeiro elemento que corresponde à condição dada, ou null se nenhum elemento corresponder.
  

- `foreach()`: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html
  - Executa a ação dada em cada elemento da coleção.
  

- `filter()`: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html
  - Retorna uma lista contendo apenas os elementos que correspondem à condição dada.


- `Properties`: https://kotlinlang.org/docs/properties.html#custom-getters-and-setters



  
## 5. Testing and Validation
<!-- Testing strategy, test cases, scenarios, edge cases, and known limitations. -->

### Exercício 1: Quadrados Perfeitos

Neste exercício foram feitos testes cada vez que se implementava uma alínea do mesmo, para verificar se a implementação
se encontra corretamente funcional. Após a realização dos três tipos diferentes de implementação, verificou-se que todos
apresentam o mesmo resultado.

### Exercício 2: Calculadora em Consola

Neste exercício os testes foram sendo realizados por partes: 

- Os primeiros testes foram realizados após a implementação de uma base do código, ou seja, após a construção dos menus
e apenas com a introdução correta dos inputs, apenas para observar se as ligações entre os menus estavam corretas;
- Os segundos testes foram realizados para verificar o tratamento de exceções e o bom funcionamento da continuidade
dos menus quando era introduzido um input inválido.

Após a realização destes testes, conseguiu-se chegar a uma calculadora funcional que não bloqueia quando é introduzido um
valor errado ou fora do esperado.

<!-- ### Exercício 3: Sequência de Saltos -->

### Exercício 6: Sistema de Biblioteca Virtual
Para a realização deste exercício foi fornecido um output esperado, então após criadas as classes bases, foram sendo realizados
testes para chegar ao output pretendido.


## 6. Usage Instructions
<!-- How to run the project: requirements, setup, configuration, and execution steps.
    -->
Para se aceder ao projeto desenvolvido, terá que ter acesso a este repositório para posteriormente conseguir abrir o projeto
no IDE IntelliJ IDEA.

Do exercício 1 ao 3, cada ficheiro correspondente ao exercício, é um ficheiro executável. No exercício 6, o ficheiro que deve
ser executado para observar o funcionamento da biblioteca é o ficheiro `Main.kt` que se encontra no package correspondente a 
esse exercício, em conjunto com todas as classes desenvolvidas.


---

# Development Process
## 12. Version Control and Commit History
<!-- Describe how version control was used. The commit history must reflect continuous work (not only final commits). -->

Para a realização do controlo de versões foi utilizado o Git. Ao longo do desenvolvimento dos exercícios foram realizados
vários commits até se realizar o final, indicando que esse exercício se encontra concluído.


## 13. Difficulties and Lessons Learned
<!-- Main challenges, mistakes, insights, and skills acquired during the assignment.
    -->
Tendo sido a primeira vez a utilizar o Git para este propósito, a criação do primeiro repositório e da ligação com o IDE
IntelliJ foi um dos primeiros desafios. Tendo sido também a primeira vez a lidar com a linguagem de programação Kotlin, 
a sua documentação não se revelou ser muito intuitiva de navegar nem muito esclarecedora nos seus conteúdos, apresentando
muito pouca informação em relação a inúmeros conceitos, o que levou à não realização de alguns exercícios e ao recurso de
IA para conseguir perceber e fazer certas partes do trabalho.

## 14. Future Improvements
<!-- Possible extensions, optimizations, or features that could be added in future work. -->

Os possíveis melhoramentos recaem sobre um melhor entendimento da linguagem Kotlin para conseguir estruturar a implementação
dos exercícios de uma forma mais modular e não tão extensa e repetitiva.

---

## 15. AI Usage Disclosure (Mandatory)
<!-- List all AI tools used (e.g., ChatGPT, Copilot, etc.), how they were used, and
    confirmation that you remain responsible for all content. -->

- **LLM Utilizado:** DeepSeek
- **Como foi Utilizada:** Exclusivamente para ajudar na introdução à linguagem Kotlin e a dar bases de como poderia avançar
nos exercícios
- **Responsabilidade:** Aluna Renata Góis (A51038), sou totalmente responsável pelo conteúdo apresentado e submetido neste
trabalho
