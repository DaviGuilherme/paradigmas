package org.example.ex1;

public class ListaLigadaOrdenada extends ListaLigada{

    public void exibeRecursivo(Node atual) {
        if (atual != null) {
            System.out.println(atual.getInfo());
            exibeRecursivo(atual.getNext());
        }
    }
    @Override
    public void insereNode(int valor) {
        Node atual = super.getHead().getNext();
        Node ant = super.getHead();

        Node novo = new Node(valor);
        boolean inseriu = false;


        while(atual != null && !inseriu){
            if(valor < atual.getInfo() && valor > ant.getInfo()) {
                ant.setNext(novo);
                novo.setNext(atual);
                inseriu = true;
            }else{
                ant = atual;
                atual = atual.getNext();
            }
        }
        if(!inseriu){
            ant.setNext(novo);
        }
    }

    @Override
    public Node buscaNode(int valor) {
        Node atual = getHead().getNext();
        boolean achou = false;

        while(atual != null && achou){
            if(valor == atual.getInfo()){
                achou = true;
                return atual;
            }else {
                atual = atual.getNext();
            }
        }

        return null;
    }

    public Node buscaNodeRecursivo(Node atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (atual.getInfo() == valor) {
            return atual;
        }

        return buscaNodeRecursivo(atual.getNext(), valor);
    }


    @Override
    public boolean removeNode(int valor) {
        return super.removeNode(valor);
    }

    public boolean removeNodeRecursivo(Node ant, Node atual, int valor) {
        if (atual == null) {
            return false;
        }

        if (atual.getInfo() == valor) {
            ant.setNext(atual.getNext());
            return true;
        }

        return removeNodeRecursivo(atual, atual.getNext(), valor);
    }

    public void concatena(ListaLigada lista){
        Node atual = lista.getHead().getNext();

        while(atual != null){
            insereNode(atual.getInfo());

            atual = atual.getNext();
        }
    }

    public boolean compara(ListaLigada ligada) {
        Node atual1 = getHead().getNext();
        Node atual2 = ligada.getHead().getNext();

        while (atual1 != null && atual2 != null) {
            if (atual1.getInfo() != atual2.getInfo()) {
                return false;
            }

            atual1 = atual1.getNext();
            atual2 = atual2.getNext();
        }

        return atual1 == null && atual2 == null;
    }

    public void inverte() {
        Node ant = null;
        Node atual = getHead().getNext();
        Node nextNode;

        while (atual != null) {
            nextNode = atual.getNext();
            atual.setNext(ant);
            ant = atual;
            atual = nextNode;
        }

        getHead().setNext(ant);
    }

    public int getTamanhoRecursivo(Node atual, int total) {
        if (atual == null) {
            return 0;
        }
        total += 1;
        return 1 + getTamanhoRecursivo(atual.getNext(), total);
    }

}
