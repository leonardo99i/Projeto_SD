package projeto_a3;

import java.io.IOException;
import java.net.Socket;

public class Principal {
    private static Socket cliente;

    public Principal(){
        iniciaCliente();
    }

    public static void main(String[] args) {
        iniciaCliente();
    }

    private static void iniciaCliente(){
        try {
            cliente = new Socket("127.0.0.1",4000);
            System.out.println("FUNCIONA");
        } catch (IOException ex) {
            System.out.println("Deu erro, não conectou ao servidor!");
        }
    }
    
}
