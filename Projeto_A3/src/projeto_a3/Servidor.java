package projeto_a3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {
    public static void main(String[] args) {
        try {
            try (//Criando o servidor 
            ServerSocket servidor = new ServerSocket(4000)) {
                System.out.println("Servidor tá on! na porta: " + servidor);
                //Canal de comunicação
                Socket cliente = servidor.accept();
                System.out.println("Cliente do ip" + cliente.getInetAddress().getHostAddress());

                Scanner entrada = new Scanner(cliente.getInputStream());
                while(entrada.hasNextLine()){
                    System.out.println(entrada.nextLine());
                }

                entrada.close();
            }
        } catch (IOException ex) {
            System.out.println("Erro ao criar o servidor");
        }
    }
    
}