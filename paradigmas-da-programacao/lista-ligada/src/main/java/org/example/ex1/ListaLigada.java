package org.example.ex1;

public class ListaLigada {
    private Node head;

    public ListaLigada() {
        this.head = new Node(0);
    }

    public void insereNode(int valor){
        Node novo = new Node(valor);

        novo.setNext(this.head.getNext());
        this.head.setNext(novo);
    }

    public void exibe(){
        Node atual = this.head.getNext();

        while (atual != null){
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public Node buscaNode(int valor){
        Node atual = this.head.getNext();

        while(atual != null){
            if(atual.getInfo() == valor){
                return atual;
            }else {
                 atual = atual.getNext();
            }
        }
        return null;
    }

    public boolean removeNode(int valor){
        Node ant =  this.head;
        Node atual = this.head.getNext();

        while(atual != null){
            if(atual.getInfo() == valor){
                ant.setNext(atual.getNext());
                return true;
            }else {
                ant = atual;
                atual = atual.getNext();
            }
        }
        return false;
    }

    public int getTamanho(){
        Node atual = this.head.getNext();

        int tam = 0;

        while(atual != null){
            tam = tam + 1;
            atual = atual.getNext();
        }

        return tam;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
