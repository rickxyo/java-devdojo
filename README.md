# ☕ Estudos em Java!

Este repositório é dedicado aos meus estudos de Java, baseados principalmente no curso completo do canal DevDojo no YouTube. Aqui você encontrará anotações, exemplos de códigos e projetos práticos conforme avanço nos conceitos.

## 🎓 Objetivo

Consolidar meu aprendizado de Java através de anotações e prática constante. O repositório também serve como material de referência para projetos futuros.

## 🔧 Recursos e Exemplos

### 1. Introdução ao Java

Instalação: Baixar o JDK, configurar as variáveis de ambiente e escolher uma IDE como IntelliJ ou Eclipse.

Primeiro Código:

```java
public class HelloWorld {
    public static void main(String[] args) {
         System.out.println("Hello, World!");
    }
}
```

### 2. Tipos Primitivos e Variáveis

Exemplo de Declaração:

```java
int idade = 25;
double salario = 4500.50;
boolean ativo = true;
char inicial = 'A';
```

Conversão de Tipos:

```java
double numero = 9.5;
int inteiro = (int) numero; // Conversão explícita (casting)
```

### 3. Operadores

Exemplo de Operadores Aritméticos:

```java
int soma = 10 + 5;
int multiplicacao = 10 * 5;
double divisao = 10.0 / 3.0;
```

Operadores Relacionais e Lógicos:

```java
boolean maior = 10 > 5; // true
boolean condicao = (10 > 5) && (5 < 3); // false
```

### 4. Estruturas Condicionais

Uso de If-Else:

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

Switch-Case:

```java
int dia = 3;
switch (dia) {
    case 1:
         System.out.println("Segunda-feira");
         break;
    case 2:
         System.out.println("Terça-feira");
         break;
    default:
         System.out.println("Outro dia");
}
```

### 5. Laços de Repetição

For:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
```

While:

```java
int contador = 0;
while (contador < 5) {
     System.out.println("Contador: " + contador);
     contador++;
}
```

For-Each:

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    System.out.println("Número: " + num);
}
```

forma simplificada de iterar sobre elementos de arrays ou coleções.
Usado quando não é necessário acessar os índices dos elementos.

Explicação:

* **int num** Representa cada elemento da coleção ou array. <br>
* **numeros:** Itera por todos os elementos do array numeros.

### 6. Arrays

O que é um Array?<br>
Uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, com tamanho fixo.

Declaração e Inicialização:

```java
int[] numeros = new int[5];
numeros[0] = 10;
int[] outrosNumeros = {1, 2, 3, 4, 5};
```

Iteração:

```java
for (int i = 0; i < outrosNumeros.length; i++) {
    System.out.println(outrosNumeros[i]);
}
```

### 7. Métodos


Definição e Uso:<br>
Métodos são blocos de código que executam uma tarefa específica e podem ser reutilizados.

Declaração de um Método:

```java
public static void saudacao() {
    System.out.println("Olá, mundo!");
}
```

Chamando um Método:

```
saudacao(); // Executa o método
```

Métodos com Parâmetros:

```java
public static void soma(int a, int b) {
    System.out.println("Resultado: " + (a + b));
}

soma(5, 3); // Chama o método com os argumentos 5 e 3
```

Métodos com Retorno:

```java
public static int multiplicar(int a, int b) {
    return a * b;
}

int resultado = multiplicar(4, 5);
System.out.println(resultado); // Imprime 20
```

## 8. Orientação a Objetos (OO)

**O que é Orientação a Objetos?**<br>
Paradigma que organiza o código em torno de objetos, que possuem atributos (dados) e métodos (comportamentos).

Conceitos Principais:

* **Classe:** Modelo ou estrutura para criar objetos.<br>
* **Objeto:** Instância de uma classe.<br>
* **Encapsulamento:** Controle do acesso aos atributos e métodos.<br>
* **Herança:** Reutilização de código entre classes.<br>
* **Polimorfismo:** Capacidade de um objeto se comportar de várias formas.<br>