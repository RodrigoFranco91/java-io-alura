package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Cliente  implements Serializable {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
/*

Serializando uma classe com Herança e com composição:

Para serializar classes com composição, todos envolvidos (relacionamento), devem implementar a interface Serializable. Pense no
exemplo: objeto contaCorrente tem um atributo do tipo cliente, ambos devem imeplemtar a interface.
Há uma outra opção, no caso classe Cliente não precisaria implementar a interface, bastaria colocar no atributo cliente lá na
classe Conta a palavra chave: transient (há uma anotação para isso), mas neste caso vamos jogar fora o relacionamento!

Para deserializar classes com herança, todas classes envolvidas (filha e mãe) devem implementar a interface Serializable.
Pense no exemplo: objeto contaCorrente tem um atributo do tipo cliente, ambos devem imeplemtar a interface, mas a classe mae de
ContaCorrente também deverá, pois sua filha contaCorrente chama o construtor da classe mãe, neste caso ou filha e mãe implementa ou
somente a mãe...

 */
