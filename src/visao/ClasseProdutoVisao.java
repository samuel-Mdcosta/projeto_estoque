package visao;

import java.time.LocalDate;

import dominio.ClasseProduto;

public class ClasseProdutoVisao {
    
    //construtor vazio
    public ClasseProdutoVisao(){
    }

    //função de teste para ver se esta funcionando
    public void Exibir(){

        //estacia de objeto
        ClasseProduto cp1 = new ClasseProduto();
        cp1.setCodigo(1);
        cp1.setDescricao("Bebidas");
        cp1.setDataDeInclusao(LocalDate.now());

        System.out.println("classe de Produto");
        System.out.println("Codigo: " + cp1.getCodigo());
        System.out.println("Descrição: " + cp1.getDescricao());
        System.out.println("Data de Inclusão: " + cp1.getDataDeInclusao());

        ClasseProduto cp2 = new ClasseProduto(2, "carnes", LocalDate.now());
        System.out.println("classe de Produto");
        System.out.println("Codigo: " + cp2.getCodigo());
        System.out.println("Descrição: " + cp2.getDescricao());
        System.out.println("Data de Inclusão: " + cp2.getDataDeInclusao());
    }
}
