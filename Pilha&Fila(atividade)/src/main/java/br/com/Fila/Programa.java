package br.com.Fila;

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        fila av = new fila();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("||-------------------------------------------------------------------------------------------||");
            System.out.println("||                                                                                           ||");
            System.out.println("|| Seja bem vindo a central de consultoria de atendimento do Banco do Brasil!! O que deseja? ||");
            System.out.println("||                                                                                           ||");
            System.out.println("||-------------------------------------------------------------------------------------------||");
            System.out.println("||-------------------------------------------------------------------------------------------||");
            System.out.println("|| 1.Adicionar item                                                                          ||");
            System.out.println("|| 2.Eliminar item                                                                           ||");
            System.out.println("|| 3.Mostrar todos elementos em ordem                                                        ||");
            System.out.println("|| 4.Mostrar primeiro elemento                                                               ||");
            System.out.println("|| 5.Verificar se a fila está vazia                                                          ||");
            System.out.println("|| 6.Sair                                                                                    ||");
            System.out.println("||-------------------------------------------------------------------------------------------||");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.print("Insira a opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case (1):
                    System.out.println("Adicione um nome a fila do banco de dados");
                    String valor = sc.nextLine();
                    System.out.println(av.enqeue(valor));
                    break;

                case(2):
                    System.out.println("Elimine um nome da fila do banco de dados");
                    System.out.println(av.deqeue());
                    break;

                case(3):
                    System.out.println("Todos os elementos da fila atualmente: ");
                    av.listarElementos();
                    break;

                case(4):
                    System.out.println("primeiro elemento da fila: ");
                    av.peek();
                    break;

                case(5):
                    System.out.println("Verificando se a lista esta vazia: ");
                    av.verificarSeEstaVazio();
                    break;

                case(6):
                    System.out.println("Encerrado");
            }
        }while (opcao != 6) ;
    }
}