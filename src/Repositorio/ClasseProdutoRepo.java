package Repositorio;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDb;

public class ClasseProdutoRepo extends BaseRepo<ClasseProduto>{
    private ClasseProdutoFakeDb db;

    public ClasseProdutoRepo(){
        //crianto uma nova instancia de com atributos de ClaseProdutoDb
        this.db = new ClasseProdutoFakeDb();
        this.fonteDeDados = this.db.getTabela();
    }

    @Override
    public ClasseProduto Create(ClasseProduto instancia) {
        int proxChave = this.fonteDeDados.getLast().getCodigo();
        proxChave++;
        instancia.setCodigo(proxChave);
        this.fonteDeDados.add(instancia);
        return instancia;
    }

    @Override
    public ClasseProduto Read(int chave) {
        for (ClasseProduto cp : this.fonteDeDados) {
            if(cp.getCodigo() == chave){
                return cp;
            }
        }
        return null;
    }

    @Override
    public ClasseProduto Update(ClasseProduto instancia) {
     ClasseProduto cp = this.Read(instancia.getCodigo());
     if (cp != null) {
        cp.setDescricao(instancia.getDescricao());
        return cp;
     }else{
        return null;
     }
    }

    @Override
    public ClasseProduto Delete(int chave) {
       ClasseProduto cp = this.Read(chave);
       if(cp != null){
        this.fonteDeDados.remove(cp);
        return cp;
       }else{
        return null;
       }
    }
}
