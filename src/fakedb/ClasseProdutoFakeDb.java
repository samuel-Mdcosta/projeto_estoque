package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.ClasseProduto;

public class ClasseProdutoFakeDb extends BaseFakeDb<ClasseProduto>{

    @Override
    //OVERRIDE faz com que sobreescreva o metodo, e não crie outro
    protected void preencherDados() {

        //deve-se estanciar a tabela pois em BaseFakeDb so foi declarada
        this.tabela = new ArrayList<ClasseProduto>();
        //add uma intancia de ClasseProduto a tabela 
        this.tabela.add(new ClasseProduto(1, "Carnes", LocalDate.now()));
        this.tabela.add(new ClasseProduto(2, "Bebidas", LocalDate.now()));
        this.tabela.add(new ClasseProduto(3, "Laticinios", LocalDate.now()));
        this.tabela.add(new ClasseProduto(4, "Higiene", LocalDate.now()));
        this.tabela.add(new ClasseProduto(5, "Limpeza", LocalDate.now()));
    }

    //construtor da classe
    public ClasseProdutoFakeDb(){
        super();
        //chama os atributos do pai
    }
}
