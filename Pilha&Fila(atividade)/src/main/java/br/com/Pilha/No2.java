package br.com.Pilha;

public class No2 {
    private String guiaFechada;
    private No2 proximo;

    public No2(String guiaFechada) {
        this.guiaFechada = guiaFechada;
        this.proximo = null;
    }

    public String getGuiaFechada() {
        return guiaFechada;
    }

    public void setGuiaFechada(String guiaFechada) {
        this.guiaFechada = guiaFechada;
    }

    public No2 getProximo() {
        return proximo;
    }

    public void setProximo(No2 proximo) {
        this.proximo = proximo;
    }
}

