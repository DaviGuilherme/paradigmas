package org.example.ex2;

public class FilaPilha {
    private int[] vetor;
    private int topo;
    private int inicioFila;
    private int tamanho;

    public FilaPilha(int capacidade) {
        vetor = new int[capacidade];
        topo = capacidade - 1;
        inicioFila = 0;
        tamanho = 0;
    }

    public boolean isPilhaEmpty() {
        return tamanho == 0;
    }

    public boolean isFilaEmpty() {
        return tamanho == vetor.length;
    }

    public boolean isPilhaFull() {
        return tamanho == vetor.length;
    }

    public boolean isFilaFull() {
        return tamanho == vetor.length;
    }

    public void push(int numero) {
        if (!isPilhaFull()) {
            vetor[topo--] = numero;
            tamanho++;
        }
    }

    public void insert(int numero) {
        if (!isFilaFull()) {
            vetor[inicioFila + tamanho] = numero;
            tamanho++;
        }
    }

    public int pop() {
        if (!isPilhaEmpty()) {
            tamanho--;
            return vetor[++topo];
        }
        throw new IllegalStateException("Pilha vazia");
    }

    public int poll() {
        if (!isFilaEmpty()) {
            return vetor[inicioFila++];
        }
        throw new IllegalStateException("Fila vazia");
    }

    public void exibe() {
        System.out.println("Pilha (do topo para a base):");
        for (int i = topo + 1; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Fila (do início para o fim):");
        for (int i = inicioFila; i < inicioFila + tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void exibeRecursivo() {
        System.out.println("Pilha (do topo para a base):");
        exibeRecursivoPilha(topo + 1);

        System.out.println("Fila (do início para o fim):");
        exibeRecursivoFila(inicioFila);
    }

    private void exibeRecursivoPilha(int index) {
        if (index < vetor.length) {
            exibeRecursivoPilha(index + 1);
            System.out.println(vetor[index]);
        }
    }

    private void exibeRecursivoFila(int index) {
        if (index < inicioFila + tamanho) {
            System.out.println(vetor[index]);
            exibeRecursivoFila(index + 1);
        }
    }


}