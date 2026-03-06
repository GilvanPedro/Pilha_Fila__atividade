package br.com.Fila;

public class fila {
    No inicio;
    No fim;

    public fila() {
        this.inicio = null;
        this.fim = null;
    }

    public String enqeue(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        return valor;
    }

    public String deqeue() {
        if (inicio == null) {
            System.out.println("Lista Vazia");
        }
        String valor = inicio.getDado();
        inicio = inicio.getProximo();
        return valor;
    }

    public void listarElementos() {
        if(inicio == null){
            System.out.println("fila esta vazia");
            return;
        }
        No aux = inicio;
        while (aux != null) {
            System.out.println("elemento: " + "[" + aux.getDado() + "]");
            aux = aux.getProximo();
        }
        System.out.println();
    }

    public void peek() {
        if (inicio == null) {
            System.out.println("Lista esta vazia");
        } else {
            System.out.println(inicio.getDado());
        }
    }
    public void verificarSeEstaVazio() {
        if (inicio == null) {
            System.out.println("Fila esta vazia");
        }else{
            System.out.println("A fila não esta vazia, os elementos dentro dela são: ");
            listarElementos();
        }
    }
}
