package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDb;

public class ClasseProdutoVisao {

    //construtor vazio da classe
    public ClasseProdutoVisao(){
    }
    
    // Função que vai mostrar a tabela
    public void Exibir(){
        ClasseProdutoFakeDb db = new ClasseProdutoFakeDb();
        ArrayList<ClasseProduto> lista = db.getTabela();
        System.out.println("===================================");
        for (ClasseProduto cp: lista) {
            //tipo da coleção / nome da variavel / coleção
            System.out.println("Classe de produtos");
            System.out.println("Codigo: " + cp.getCodigo());
            System.out.println("descrição: " + cp.getDescricao());
            System.out.println("Data de Inclusão: " + cp.getDataDeInclusao());
            System.out.println("------------------------------");
        }
    }

}