package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaMaisFacil {

    public static void main(String[] args) throws IOException {

        //Para escrever estavamos usando as 3 linhas:
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);

        //No modo fácil, basta:
        //FileWriter fw = new FileWriter("lorem2.txt");
        //BufferedWriter bw = new BufferedWriter(fw);

        //No modo mais fácil ainda (opcao 1):
        //PrintStream ps = new PrintStream("lorem2.txt");

        //No modo mais fácil ainda (opcao 2):
        //Definindo que vamos escrever no arquivo usando charset UTF-8
        PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");

        //Escrevendo no arquivo. Usando println ao terminar alinha o cursor já é jogado para proxima.
        ps.println("Escrevendo a priminha linha");
        ps.println();
        ps.println("Escrevendo a segunda linha");

        //Fechando a leitura.
        ps.close();
    }
}
