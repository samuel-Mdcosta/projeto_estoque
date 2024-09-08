package dominio;

import java.time.LocalDate;

public class Produto extends BaseParametro{

    private int codigoSubClasse;
    private double valor;

    //get e setter das variaveis reais or isso private
    public int getCodigoSubClasse() {
        return codigoSubClasse;
    }
    public void setCodigoSubClasse(int codigoSubClasse) {
        this.codigoSubClasse = codigoSubClasse;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    //constructor rescebendo os atributos do pai elo super
    public Produto() {
        super();
    }

    //construtor rescebendo os atributos do pai por parametros da classe produto;
    public Produto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoSubClasse, double valor) {
        super(codigo, descricao, dataDeInclusao);
        this.codigoSubClasse = codigoSubClasse;
        this.valor = valor;
    }
        
}