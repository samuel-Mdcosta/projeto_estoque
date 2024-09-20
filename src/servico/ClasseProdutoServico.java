package servico;

import java.util.ArrayList;

import Repositorio.ClasseProdutoRepo;
import dominio.ClasseProduto;

public abstract class ClasseProdutoServico extends BaseServico<ClasseProduto> {

    public ClasseProdutoRepo repositorio;

    public ClasseProdutoServico(){
        this.repositorio = new ClasseProdutoRepo();
    }

    @Override
    public ClasseProduto Criar(ClasseProduto obj) {
        return this.repositorio.Create(obj);
    }


    @Override
    public ClasseProduto Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public ArrayList<ClasseProduto> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public ClasseProduto Atualizar(ClasseProduto obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public ClasseProduto Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }


    
}