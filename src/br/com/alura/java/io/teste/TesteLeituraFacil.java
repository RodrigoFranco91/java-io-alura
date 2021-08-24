package br.com.alura.java.io.teste;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraFacil {

    public static void main(String[] args) throws FileNotFoundException {

        //Fluxo de Entrada com arquivo.

        //Lendo o arquivo
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        //Verificando se no arquivo há linhas a ser lidas
        while(scanner.hasNext()){
            //Lendo a linha
            String linha = scanner.nextLine();

            //Quebrando com split.
            //String[] valores = linha.split(",");
            //System.out.println(valores[3]);

            //Lendo a linha com scanner
            Scanner linhaScanner = new Scanner(linha);

            //Configurando para ler um double com ponto.
            linhaScanner.useLocale(Locale.US);

            //Quebrando com useDelimiter
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            //Formatando o jeito que será printado.
            //% define o time da variável que passamos, o %s é de String
            //DEvemos consultar a documentação para saber o caractere de cada tipo.
            //Locale não é obrigatório...Como não há Locale.BR, tivemos que dar um new()
            String valorFormatado = String.format(new Locale("pt", "BR"),"%s - %04d - %08d - %s - %08.2f",valor1,valor2,valor3,valor4,valor5);
            System.out.println(valorFormatado);

        }

        scanner.close();
    }
}
