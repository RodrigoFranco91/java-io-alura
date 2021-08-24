package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de Saída com arquivo.

        //Vamos escrever no arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt");

        //OutputStreamWriter é que saberá escrever os caracteres em bits
        Writer osw = new OutputStreamWriter(fos);

        //Vamos escrever uma string completa
        BufferedWriter bw = new BufferedWriter(osw);

        //Escrevendo no arquivo. o newLine() serve para jogar o cursor para linha de baixo
        //Para deixar uma linha vazia temos que usar 2x o newLine()
        bw.write("Escrevendo a priminha linha");
        bw.newLine();
        bw.newLine();
        bw.write("Escrevendo a segunda linha");

        //Fechando a leitura.
        bw.close();
    }
}
