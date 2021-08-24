package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com arquivo.

        //Lendo o arquivo
        InputStream fis = new FileInputStream("lorem.txt");

        //InputStreamReader é que saberá ler o int (bits) e transformar em char
        //Só que guardará cada caractere em um array
        Reader isr = new InputStreamReader(fis, "UTF-8");

        //Vamos conseguir ler linha por linha.
        BufferedReader br = new BufferedReader(isr);

        //Lendo a primeira linha do arquivo
        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        //Fechando a leitura.
        br.close();
    }
}
