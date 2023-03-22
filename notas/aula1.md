# POO

## Motivação

```java
String[] nomes = new String[10];
int[] idades = new int[10];
double[] notas = new double[10];
```

como trocar duas variáveis:

```java
int a = 4, b = 15; // a = 4 , b = 15
int temp = a; // a = 4, b = 15, temp = 4
a = b; // a = 15, b = 15, temp = 4
b = temp; // a = 15, b = 4, temp = 4
// a = 15, b = 4
```

## Introdução

**Classe:** Molde, Novo tipo de variável
**Objeto:** Fruto do molde

## O que compõe uma classe?

- tem (atributos/variáveis)
- faz (processo/método)

```java
class Carro {

  String marca;
  int ano;
  double combustivel = 0;
  boolean ligado = false;

  void ligar() {
    if(combustivel > 0)
      ligado = true;
  }

  void desligar() {
    ligado = false;
  }

  void abastecer(double quantiaDeCombustivel) {
    combustivel += quantiaDeCombustivel;
  }

}
```

```java
Carro ferrari = new Carro();
ferrari.marca = "Ferrari";
ferrari.ano = 2018;
ferrari.combustivel = 10000000000; // TODO melhorar
ferrari.ligado = true;
```

## Para melhorar

- **criação (construtores)**

Método construtor

- **utilização (encapsulamento)**
