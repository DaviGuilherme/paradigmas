package org.example.ex1;

public class DuasPilhas {
    private int[] pilha;
    private int topo1;
    private int topo2;

    public DuasPilhas(int capacidade) {
        pilha = new int[capacidade];
        topo1 = -1;
        topo2 = capacidade;
    }

    public Boolean isEmpty() {
        return topo1 == -1 && topo2 == pilha.length;
    }

    public Boolean isFull() {
        return topo1 + topo2 == pilha.length -1;
    }

    public void push(int numero, String pilha) {
        if(pilha.equalsIgnoreCase("Topo1")){
            this.pilha[++topo1] = numero;
        }else {
            this.pilha[--topo2] = numero;
        }
    }

    public int pop(String pilha) {
        if(isEmpty()){
            throw new IllegalStateException("Vazio");
        }
        if(pilha.equalsIgnoreCase("Topo1")){
            return this.pilha[topo1--];
        }else {
            return this.pilha[topo2++];
        }
    }

    public int peek(String pilha) {
        if(pilha.equalsIgnoreCase("Topo1")){
            return this.pilha[topo1];
        }else {
            return this.pilha[topo2];
        }
    }

    public void exibe() {
        if(isEmpty()){
            System.out.println("Pilha vazia");
        }else {
            System.out.println("Topo1");
            for(int i = topo1;i >= 0;i--){
                System.out.println(pop("Topo1"));
            }
            System.out.println("Topo2");
            for(int i = topo2;i < pilha.length;i++){
                System.out.println(pop("Topo2"));
            }
        }
    }

    private void recursivo(int topo1, int topo2) {
        if (topo1 >= 0) {
            System.out.println("Topo1");
            System.out.println(pilha[topo1]);
            pop("Topo1");
            recursivo(topo1 - 1, topo2);
        } else if (topo2 < pilha.length) {
            System.out.println("Topo2");
            System.out.println(pilha[topo2]);
            pop("Topo2");
            recursivo(topo1, topo2 + 1);
        }
    }

    public void exibeRecursivo(){
        recursivo(this.topo1, this.topo2);
    }

}
