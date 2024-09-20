package dominio;

import java.time.LocalDate;

import servico.ClasseProdutoServico;

public class ClasseProduto extends BaseParametro{
    public ClasseProduto(){

        //reresenta a classe pai
        super();
    }

    //contrutor herdando os atributos do pai por parametro
    public ClasseProduto(int codigo, String descricao, LocalDate dataDeInclusao){

        //representa a classe pai, resebendo seus atributos por parametros
        super(codigo, descricao, dataDeInclusao);
    }

    public ClasseProduto criar(ClasseProdutoServico classeProdutoServico) {
        return classeProdutoServico.repositorio.Create(this);
    }
}



//Classe real OS ATRIBUTOS SÃo PRIVADOS
//para herdar de um pai os atributos usa-se o extends na classe