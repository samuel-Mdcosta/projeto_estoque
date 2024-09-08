package dominio;

import java.time.LocalDate;

public class SubClasseProduto extends BaseParametro {

    //classe real
    private int codigoClasse;

    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    //constructor rescebendo os atributos do pai elo super
    public SubClasseProduto() {
        super();
    }

    public SubClasseProduto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoClasse) {

        //super do pai
        super(codigo, descricao, dataDeInclusao);

        //variavel do parametro do codigoclasse
        this.codigoClasse = codigoClasse;
    }

    
    
}
