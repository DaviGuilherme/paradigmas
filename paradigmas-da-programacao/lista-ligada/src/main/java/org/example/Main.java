package org.example;

import org.example.ex1.ListaLigada;
import org.example.ex1.ListaLigadaOrdenada;

public class Main {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.insereNode(55);
        listaLigada.insereNode(44);
        listaLigada.insereNode(33);

        listaLigada.exibe();

        ListaLigadaOrdenada listaOrdenada = new ListaLigadaOrdenada();
//        listaOrdenada.insereNode(55);
//        listaOrdenada.insereNode(44);
//        listaOrdenada.insereNode(33);
        listaOrdenada.insereNode(1);
        listaOrdenada.insereNode(2);
        listaOrdenada.insereNode(4);
        listaOrdenada.insereNode(3);
        listaOrdenada.exibe();
        System.out.println("======= Remove ======");
        listaOrdenada.removeNode(2);
        listaOrdenada.exibe();
        System.out.println("======= Concatena ======");
        listaOrdenada.concatena(listaLigada);
        listaOrdenada.exibe();
        System.out.println("===== Compara ========");
        System.out.println(listaOrdenada.compara(listaLigada));
        System.out.println("== ordenada ==");
        listaOrdenada.exibe();
        System.out.println("== ligada ==");
        listaLigada.exibe();
        System.out.println("====== inverte =====");
        listaOrdenada.inverte();
        listaOrdenada.exibe();
        System.out.println("==== métodos recursivos ====");
        System.out.println("==== exibe ====");
        listaOrdenada.exibeRecursivo(listaOrdenada.getHead().getNext());
        System.out.println("==== buscaNode ==== ");
        System.out.println(listaOrdenada.buscaNodeRecursivo(listaOrdenada.getHead().getNext(), 1));
        System.out.println("==== remove ====");
        System.out.println(listaOrdenada.removeNodeRecursivo(listaOrdenada.getHead(),listaOrdenada.getHead().getNext(), 44));
        System.out.println("==== getTamnho ====");
        System.out.println(listaOrdenada.getTamanhoRecursivo(listaOrdenada.getHead().getNext(), 0));
    }
}