package br.com.Pilha;

public class Pilha {
    private No topo = null;
    private No2 topo2 = null;

    // Inserir no topo
    public void push(String guia) {
        No novo = new No(guia);
        novo.setProximo(topo);
        topo = novo;
    }

    // Exibir elementos
    public void consultar() {
        if (topo == null) {
            System.out.println("Nenhuma guia aberta");
            return;
        }

        No atual = topo;
        while (atual != null) {
            System.out.println(atual.getGuiaAberta());
            atual = atual.getProximo();
        }
    }

    public String retornarGuia(){
        if (topo != null) {
            return topo.getGuiaAberta();
        }
        return null;
    }
    // Remover topo
    public String pop() {
        if (topo == null) {
            System.out.println("Não há guias para fechar");
            return null;
        }

        String valor = topo.getGuiaAberta();
        topo = topo.getProximo();

        //adicionando o valor retirado na pila na outra pilha de guias excluidas
        guiasFechadas(valor);

        return valor;
    }

    // Adicionando uma nova pilha das guias fechadas
    public void guiasFechadas(String valor) {
        No2 novo = new No2(valor);
        novo.setProximo(topo2);
        topo2 = novo;
    }

    // Mostrando as guias que foram fechadas
    public void exibirGuiasFechadas(){
        if (topo2 == null) {
            System.out.println("A pilha está vazia");
            return;
        }

        No2 atual = topo2;
        while (atual != null) {
            System.out.println(atual.getGuiaFechada());
            atual = atual.getProximo();
        }
    }

    // Reabre as guias fechadas
    public String reabrirGuiasFechadas(){
        if (topo2 == null) {
            System.out.println("Não há guias para reabrir");
            return null;
        }

        String valor = topo2.getGuiaFechada();
        topo2 = topo2.getProximo();
        push(valor);

        return valor;
    }

    // Retorna a última guia fechada
    public String guiaretornada(){
        if(topo2 != null) {
            return topo2.getGuiaFechada();
        }
        return null;
    }
}