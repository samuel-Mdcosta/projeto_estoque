package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;

import Repositorio.ClasseProdutoRepo;

public class ClasseProdutoVisao {

    //construtor vazio da classe
    public ClasseProdutoVisao(){
    }
    
    // Função que vai mostrar a tabela
    public void Exibir(){
       ClasseProdutoRepo repo = new ClasseProdutoRepo();
        ArrayList<ClasseProduto> lista = repo.ReadAll();
        for(ClasseProduto cp : lista){
            this.imprimir(cp);
        }
    }

    private void imprimir(ClasseProduto cp){
        System.out.println("Classe de Produto");
        System.out.println("Codigo: " + cp.getCodigo());
        System.out.println("descrição: " + cp.getDescricao());
        System.out.println("Data da Inclusão: " + cp.getDataDeInclusao());
    }

}