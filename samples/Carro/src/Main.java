class Carro {
    String marca;
    int ano;
    double combustivel = 0;
    boolean ligado = false;

    Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public Carro(String marca, int ano, double combustivel) {
        this(marca, ano);
        this.combustivel = combustivel;
    }

    void ligar() {
        if(combustivel > 0)
            ligado = true;
    }

    void desligar() {
        ligado = false;
    }

    void abastecer(double combustivel) {
        this.combustivel += combustivel;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro ferrari = new Carro("Ferrari", 2018);
        Carro bmw = new Carro("BMW", 2018);

        ferrari.abastecer(20);
        ferrari.ligar();
        System.out.println(ferrari.ligado);
        ferrari.desligar();
        System.out.println(ferrari.ligado);

        // 1. Reuso
        // 2. Flexivel
        // 2.5 e se esse código fosse muito grande?
    }

}