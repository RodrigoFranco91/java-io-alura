package br.com.alura.java.io.teste;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String caracter = "CASA";
        //Pegando o codepoint da letra C, por isso usamos o indice 0
        System.out.println(caracter.codePointAt(0));

        //Verificando o charset que esta sendo usado.
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        //Verificando quantos byts necessários para escrever o valor da variavel caracter
        //Neste caso estamos calculando com o uso do charset padrão.
        byte[] bytes = caracter.getBytes();
        System.out.println(bytes.length + " ,UTF-8");

        //Verificando quantos byts necessários para escrever o valor da variavel caracter
        //Neste caso estamos calculando com o uso do charset US_ASCII.
        byte[] bytes2 = caracter.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes2.length + " ,US_ASCII");

        //Construindo um caracter através do byte
        //Ta usando o charset padrão.
        String novoCaractere = new String(bytes2);
        System.out.println(novoCaractere);

        //Construindo um caracter através do byte
        //Ta usando o charset US_ASCII.
        String novoCaractere2 = new String(bytes2, "US-ASCII");
        System.out.println(novoCaractere2);

    }
}
