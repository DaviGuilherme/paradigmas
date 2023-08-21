package org.example.ex3;

public class PilhaFila {
    private int[] vetor;
    private int topoPilha;
    private int inicioFila;
    private int tamanho;

    public PilhaFila(int capacidade) {
        vetor = new int[capacidade];
        topoPilha = -1;
        inicioFila = 0;
        tamanho = 0;
    }

    public boolean isPilhaEmpty() {
        return topoPilha == -1;
    }

    public boolean isFilaEmpty() {
        return tamanho == 0;
    }

    public boolean isPilhaFull() {
        return topoPilha == vetor.length - 1;
    }

    public boolean isFilaFull() {
        return tamanho == vetor.length;
    }

    public void push(int numero) {
        if (!isPilhaFull()) {
            vetor[++topoPilha] = numero;
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
            return vetor[topoPilha--];
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
        for (int i = topoPilha; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        System.out.println("Fila (do início para o fim):");
        for (int i = inicioFila; i < inicioFila + tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void exibeRecursivo() {
        System.out.println("Pilha (do topo para a base):");
        exibeRecursivoPilha(topoPilha);

        System.out.println("Fila (do início para o fim):");
        exibeRecursivoFila(inicioFila);
    }

    private void exibeRecursivoPilha(int index) {
        if (index >= 0) {
            System.out.println(vetor[index]);
            exibeRecursivoPilha(index - 1);
        }
    }

    private void exibeRecursivoFila(int index) {
        if (index < inicioFila + tamanho) {
            System.out.println(vetor[index]);
            exibeRecursivoFila(index + 1);
        }
    }
}
