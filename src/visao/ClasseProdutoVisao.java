package visao;

import java.time.LocalDate;

import java.util.ArrayList;

import dominio.ClasseProduto;

import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {

    private ClasseProdutoServico srv;

    //construtor vazio da classe
    public ClasseProdutoVisao(){
        this.srv = new ClasseProdutoServico(){};
    }

    public void Criar(){
        ClasseProduto cp = new ClasseProduto();
        cp.setCodigo(0);
        cp.setDescricao("Teste");
        cp.setDataDeInclusao(LocalDate.now());
        this.srv.Criar(cp);
        this.imprimir(cp);
    }
    
    // Função que vai mostrar a tabela
    public void Exibir(){
        ArrayList<ClasseProduto> lista = this.srv.LerTodos();
        System.out.println("=============================");
        for(ClasseProduto cp : lista){
            this.imprimir(cp);
        }
    }

    public void ExibirPorLinha(){
        ArrayList<ClasseProduto> lista = this.srv.LerTodos();
        System.out.println("============================");
        for (ClasseProduto cp : lista) {
            this.ImprimirEmLinha(cp);
        }
    }

    private void imprimir(ClasseProduto cp){
        System.out.println("Classe de Produto");
        System.out.println("Codigo: " + cp.getCodigo());
        System.out.println("descrição: " + cp.getDescricao());
        System.out.println("Data da Inclusão: " + cp.getDataDeInclusao());
    }

    private void ImprimirEmLinha(ClasseProduto cp){
        String msg = "Classe de Produto - ";
        msg += "Código: " + cp.getCodigo() + " | ";
        msg += "Descrição: " + cp.getDescricao() + " | ";
        msg += "Data de Inclusão: " + cp.getDataDeInclusao();
        System.out.println(msg);
    }

}