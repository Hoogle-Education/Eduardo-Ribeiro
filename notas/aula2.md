```java
public class Circle {
  public static final double PI = 3.14159265;
}

public class Application {
  public static double revenuePerYear = 0.13;
}
```

# Relationamentos

## Herança - "é um;é uma"

```java
public class Pessoa {

  private String nome;
  private String cpf;
  private String email;
  private int idade;

}

public class Aluno extends Pessoa {

  private double notaFinal;
  private String turma;

}
```
