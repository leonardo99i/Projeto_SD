package projeto_a3;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class Servidor{
    public static void main(String[] args) {
      try {
        try (// Instancia o ServerSocket ouvindo a porta 1025
        ServerSocket servidor = new ServerSocket(1025)) {
            System.out.print("Servidor ouvindo a porta: " + servidor);
            while(true) {
              // o método accept() bloqueia a execução até que
              // o servidor receba um pedido de conexão
              Socket cliente = servidor.accept();
              System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
              ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
              saida.flush();
              saida.writeObject(new Date(0));
              saida.close();
              cliente.close();
            }
        }
      }
      catch(Exception e) {
         System.out.println("Erro: " + e.getMessage());
      }
      finally {
        System.out.println("Passou aqui");
      }
    }
  }
