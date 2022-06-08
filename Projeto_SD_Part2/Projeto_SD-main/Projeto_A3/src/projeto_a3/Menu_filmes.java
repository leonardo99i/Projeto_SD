package projeto_a3;

import java.util.Scanner;

public class Menu_filmes {
    public static void menu(){
        System.out.println("\tBuscador de Filmes");
        System.out.println("Escolha uma das opções acima:");
        System.out.println("1. Pesquisar Filme");
        System.out.println("2. Pesquisar Ano de lançaento");
        System.out.println("3. Pesquisar Diretor");
        System.out.println("4. Pesquisar Ator");
        System.out.println("5. Pesquisar Avaliação");
        System.out.println("6. Sair");
    }

    public static void Pesquisar_Filme(){
        System.out.println("Você entrou na Pesquisa de Filmes.");
    }
    
    public static void Pesquisar_Ano(){
        System.out.println("Você entrou na Pesquisa de Ano.");
    }
    
    public static void Pesquisar_Diretor(){
        System.out.println("Você entrou na Pesquisa de Diretor");
    }
    
    public static void Pesquisar_Ator(){
        System.out.println("Você entrou na Pesquisa de Ator");
    }

    public static void Pesquisar_Avaliacao(){
        System.out.println("Você entrou na Pesquisa de Avaliação");
    }

    public static void Sair(){
        System.out.println("Você Saiu.");
    }
    


    public static void main(String[] args) {
        int opcao;
        try (Scanner entrada = new Scanner(System.in)) {
            do{
                menu();
                opcao = entrada.nextInt();
                
                switch(opcao){
                case 1:
                    Pesquisar_Filme();
                    break;
                    
                case 2:
                    Pesquisar_Ano();
                    break;
                    
                case 3:
                    Pesquisar_Diretor();
                    break;
                    
                case 4:
                    Pesquisar_Ator();
                    break;

                case 5:
                    Pesquisar_Avaliacao();
                    break;

                case 6:
                    Sair();

                    break;
                
                default:
                    System.out.println("Opção inválida.");
                }
            } while(opcao != 6);
        }
    }
}
