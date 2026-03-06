package br.com;

public class No {
    private String guiaAberta;
    private No proximo;

    public No(String guiaAberta) {
        this.guiaAberta = guiaAberta;
        this.proximo = null;
    }

    public String getGuiaAberta() {
        return guiaAberta;
    }

    public void setGuiaAberta(String guiaAberta) {
        this.guiaAberta = guiaAberta;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
