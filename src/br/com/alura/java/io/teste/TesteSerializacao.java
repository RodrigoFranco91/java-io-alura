package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Ciando um objeto
        String nome = "Rodrigo Franco";

        //Escrevendo objeto em bytes
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();

        //Lendo um aquivo binario e criando um objeto através do conteudo do arquivo
        //O retorno de ObjectInputStream() é sempre object, logo temos que fazer o casting
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String lendoDoAruivo = (String) ois.readObject();
        ois.close();
        System.out.println(lendoDoAruivo);

    }

}
