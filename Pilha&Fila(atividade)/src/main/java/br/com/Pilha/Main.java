package br.com.Pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha guia = new Pilha();
        System.out.println("=======Google 2.0========");
        System.out.println("O que deseja fazer?");
        int esc = 0;
        do{
            System.out.println();
            System.out.println("""
                    1- Nova guia
                    2- Consultar guias abertas
                    3- Última guia aberta
                    4- Fechar guia
                    5- Reabrir guia fechada
                    6- Consulta de guias fechadas
                    7- Sair
                    """);
            esc = sc.nextInt();
            switch(esc){
                case 1:
                    System.out.print("Digite o nome da guia: ");
                    String nome = sc.next();
                    guia.push(nome);
                    break;

                case 2:
                    System.out.println("===== Guias Abertas =====");
                    guia.consultar();
                    break;

                case 3:
                    System.out.println("Ultima guia aberta: " + guia.retornarGuia());
                    break;

                case 4:
                    System.out.println("Fechado guia: " + guia.retornarGuia());
                    guia.pop();
                    break;

                case 5:
                    guia.reabrirGuiasFechadas();
                    break;

                case 6:
                    System.out.println("===== Guias Fechadas =====");
                    guia.exibirGuiasFechadas();
                    break;

                default:
                    System.out.println("ERROR: 404");
                    break;
            }
        }while(esc != 7);
        System.out.println("Adeus, obrigado por utilizar");


    }
}