package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Criando cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo Franco");
        cliente.setCpf("11122233344");

        //Serializando o objeto cliente.
        //Salvado no arquivo cliente.bin
        //Lembre-se a classe CLiente deve implementar a interface Serializable
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        //Deserializando objeto do tipo Cliente
        //Lendo o arquivo cliente.bin
        //Lembre-se a classe CLiente deve implementar a interface Serializable
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente lendo_cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(lendo_cliente.getNome());
    }
}
