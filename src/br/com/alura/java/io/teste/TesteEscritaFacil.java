package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFacil {

    public static void main(String[] args) throws IOException {

        //Para escrever estavamos usando as 3 linhas:
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);

        //No modo fácil, basta:
        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //Escrevendo no arquivo.
        //Para pular linha agora usamos o \n ou \r\n vai depender do sistema operacional
        //Para pular linha de modo genérico devemos usar System.lineSeparator()
        fw.write("Escrevendo a priminha linha");
//        fw.write("\r\n");
//        fw.write("\r\n");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("Escrevendo a segunda linha");

        //Fechando a leitura.
        fw.close();
    }
}
