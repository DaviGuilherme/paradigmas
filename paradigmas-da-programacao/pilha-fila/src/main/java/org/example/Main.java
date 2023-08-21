package org.example;

import org.example.ex1.DuasPilhas;
import org.example.ex2.FilaPilha;
import org.example.ex3.PilhaFila;


public class Main {

    public static void main(String[] args) {

        System.out.println("=".repeat(70));
        System.out.println("EXERCICIO - 1");

        DuasPilhas duasPilhas = new DuasPilhas(5);

        duasPilhas.push(1, "topo1");
        duasPilhas.push(-2, "topo2");
        duasPilhas.push(3, "topo1");
        duasPilhas.push(-4, "topo2");
        duasPilhas.push(5, "topo1");

        duasPilhas.exibeRecursivo();

        System.out.println("=".repeat(70));
        System.out.println("EXERCICIO - 2");


        FilaPilha filaPilha = new FilaPilha(10);

        int[] numeros = {-3, 5, -8, 12, -15, 20, -1, 7, -10, 30};

        System.out.println("Negativos: ");
        int contadorNegativo  = 0;
        int contadorPositivo = 0;
        for (int num : numeros) {
            if (num < 0) {
                contadorNegativo++;
                filaPilha.insert(num);
            }
        }
        for(int i = 0;i < contadorNegativo;i++){
            System.out.println(filaPilha.poll());
        }
        for (int num : numeros) {
            if (num >= 0) {
                contadorPositivo++;
                filaPilha.push(num);
            }
        }
        System.out.println("Positivos: ");
        for(int i = 0;i < contadorPositivo;i++){
            System.out.println(filaPilha.pop());
        }

        System.out.println("=".repeat(70));
        System.out.println("EXERCICIO - 3");

        PilhaFila pilhaFila = new PilhaFila(10);

        int[] numeros2 = {-1, 2, -1, 2, -1, 2, -1, 2, -1, 2};

        System.out.println("Negativos: ");
        int contadorNegativoPilhaFila  = 0;
        int contadorPositivoPilhaFila = 0;
        for (int num : numeros2) {
            if (num < 0) {
                contadorNegativoPilhaFila++;
                pilhaFila.insert(num);
            }
        }
        for(int i = 0;i < contadorNegativoPilhaFila;i++){
            System.out.println(pilhaFila.poll());
        }
        for (int num : numeros2) {
            if (num >= 0) {
                contadorPositivoPilhaFila++;
                pilhaFila.push(num);
            }
        }
        System.out.println("Positivos: ");
        for(int i = 0;i < contadorPositivoPilhaFila;i++){
            System.out.println(pilhaFila.pop());
        }

    }
}