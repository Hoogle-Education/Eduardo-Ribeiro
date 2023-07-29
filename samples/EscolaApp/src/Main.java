import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // homogeneo
        // limitado

        int[] numeros = new int[1000];
        // inicia = 0, termina = 999
        int[] copia = numeros;

        numeros[0] = 5;
        copia[0] = 10;

        Pessoa[] pessoas = new Pessoa[10];
        pessoas[0] = new Pessoa();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(0, 1);
        listaNumeros.get(2);

    }
}